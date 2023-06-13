SUMMARY = "Java 1 to 15 Parser and Abstract Syntax Tree for Java"
DESCRIPTION = "A set of libraries implementing a Java 1.0 - Java 15 Parser with advanced \
analysis functionalities. This includes preview features to Java 13, with Java \
14 preview features work-in-progress."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.3"

RPM_NAME = "javaparser-3.25.3-1.1.noarch.rpm"
RPM_HASH = "ef8b93583c996c3a0662133e57207a1de9427931aca618b3ebfc0a23e7e4d102b3811d260a0ec8a8aac9904665fa92ac7269ed8c2c623b9a26aa7be62d0c6bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser \
mvn(com.github.javaparser:javaparser-core) \
mvn(com.github.javaparser:javaparser-core:pom:) \
mvn(com.github.javaparser:javaparser-parent:pom:) \
mvn(com.github.javaparser:javaparser-symbol-solver-core) \
mvn(com.github.javaparser:javaparser-symbol-solver-core:pom:) \
mvn(com.github.javaparser:javaparser-symbol-solver-testing) \
mvn(com.github.javaparser:javaparser-symbol-solver-testing:pom:) \
mvn(com.google.code.javaparser:javaparser) \
mvn(com.google.code.javaparser:javaparser:pom:) \
osgi(com.github.javaparser.javaparser-core)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.guava:guava) \
mvn(org.checkerframework:checker-qual) \
mvn(org.javassist:javassist)"

inherit rpm
