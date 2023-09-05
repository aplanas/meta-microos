SUMMARY = "Java 1 to 15 Parser and Abstract Syntax Tree for Java"
DESCRIPTION = "A set of libraries implementing a Java 1.0 - Java 17 Parser with advanced \
analysis functionalities. This includes preview features to Java 13, with Java \
14 preview features work-in-progress."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.5"

RPM_NAME = "javaparser-3.25.5-1.1.noarch.rpm"
RPM_HASH = "2792cfccf0e315093b5dd52ebd3e137f9ae8e0aa4d3b5747fc239796e6512845bbc0cc7f4a93b9b02cab522383f9b7c8754e7a679b37c6268efde3cc247ec26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser \
mvn-com.github.javaparser-javaparser-core \
mvn-com.github.javaparser-javaparser-core-pom- \
mvn-com.github.javaparser-javaparser-parent-pom- \
mvn-com.github.javaparser-javaparser-symbol-solver-core \
mvn-com.github.javaparser-javaparser-symbol-solver-core-pom- \
mvn-com.github.javaparser-javaparser-symbol-solver-testing \
mvn-com.github.javaparser-javaparser-symbol-solver-testing-pom- \
mvn-com.google.code.javaparser-javaparser \
mvn-com.google.code.javaparser-javaparser-pom- \
osgi-com.github.javaparser.javaparser-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-org.checkerframework-checker-qual \
mvn-org.javassist-javassist"

inherit rpm
