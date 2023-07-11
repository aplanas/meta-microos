SUMMARY = "Java 1 to 15 Parser and Abstract Syntax Tree for Java"
DESCRIPTION = "A set of libraries implementing a Java 1.0 - Java 15 Parser with advanced \
analysis functionalities. This includes preview features to Java 13, with Java \
14 preview features work-in-progress."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.3"

RPM_NAME = "javaparser-3.25.3-1.2.noarch.rpm"
RPM_HASH = "87177d5ef1d3a39f5c2abbe40708d89285c707227cb15a54c42c4b852b399a04c5baee91f95a64edd710956cf00547e54e24a80cd7bef5c5d603cec0dea0184b"
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
