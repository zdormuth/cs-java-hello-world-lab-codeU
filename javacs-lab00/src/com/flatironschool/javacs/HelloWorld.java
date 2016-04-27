package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String version = System.getProperty("java.version"); // returns 1.7.0_76 as a string
	int position = version.indexOf('.'); //finds first occurance of . --> position = 1
	position = version.indexOf('.', position + 1); // finds second occurance of . --> position = 3
	return Double.parseDouble(version.substring(0, position));
    }

    public static void main(String[] args) {
	HelloWorld v = new HelloWorld();
	Double version_type = v.getVersion();
	System.out.println(version_type);
    }
}
