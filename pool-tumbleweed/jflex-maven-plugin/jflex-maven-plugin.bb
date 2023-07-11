SUMMARY = "JFlex Maven Plugin"
DESCRIPTION = "This is a Maven 3 plugin to generate Lexer code in Java from \
a Lexer specification, using JFlex."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-maven-plugin-1.8.2-1.8.noarch.rpm"
RPM_HASH = "b9ce50d53cb6ae69b237cf4acda1029542e343586d82a5a69aa84ac3b3fd6ac8a6bc4f575ccf907c3b15acfa3f5c5b444eb7b7a8d72a9fac61125968f0a958a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-maven-plugin \
mvn-de.jflex-jflex-maven-plugin \
mvn-de.jflex-jflex-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.guava-guava \
mvn-de.jflex-jflex \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api"

inherit rpm
