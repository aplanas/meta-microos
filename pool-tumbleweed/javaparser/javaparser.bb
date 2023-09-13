SUMMARY = "Java 1 to 15 Parser and Abstract Syntax Tree for Java"
DESCRIPTION = "A set of libraries implementing a Java 1.0 - Java 17 Parser with advanced \
analysis functionalities. This includes preview features to Java 13, with Java \
14 preview features work-in-progress."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.5"

RPM_NAME = "javaparser-3.25.5-2.1.noarch.rpm"
RPM_HASH = "ed226d27591e4786eb1ed673a69031289584f89e35180aacc8d2852f22eed9dc36398cb7bb0e7d65a04c38a3aa04e4a7cf318305db8ef696a1350694e47f645e"
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
