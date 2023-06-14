SUMMARY = "A Parser and Scanner Generator for Java"
DESCRIPTION = "Java Compiler Compiler (JavaCC) is the most popular parser generator \
for use with Java applications. A parser generator is a tool that reads \
a grammar specification and converts it to a Java program that can \
recognize matches to the grammar. In addition to the parser generator \
itself, JavaCC provides other standard capabilities related to parser \
generation such as tree building (via a tool called JJTree included \
with JavaCC), actions, debugging, etc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-7.0.11-1.5.noarch.rpm"
RPM_HASH = "3ecf5790c50a2d376e24e6cec6e9309f8d5114b911d9127fc67470ef9cd9f9eff9eb0d031b6aa80952d1fd6eb6b17f81ebba34dd7da430f4c8b6ba1cb0affeee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc \
javacc-bootstrap \
mvn-net.java.dev.javacc-javacc \
mvn-net.java.dev.javacc-javacc-pom-"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
