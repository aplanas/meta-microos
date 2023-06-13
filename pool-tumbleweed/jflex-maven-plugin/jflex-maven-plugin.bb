SUMMARY = "JFlex Maven Plugin"
DESCRIPTION = "This is a Maven 3 plugin to generate Lexer code in Java from \
a Lexer specification, using JFlex."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-maven-plugin-1.8.2-1.7.noarch.rpm"
RPM_HASH = "cc21c84449694e3beb7b3e57eeb3b5712bb437627ca6baca3acf6b43554538426edf7aa015c140810a956841d2622d5889c4547e41b5becea02db881082ccbf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-maven-plugin \
mvn(de.jflex:jflex-maven-plugin) \
mvn(de.jflex:jflex-maven-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.code.findbugs:jsr305) \
mvn(com.google.guava:guava) \
mvn(de.jflex:jflex) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api)"

inherit rpm
