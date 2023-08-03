SUMMARY = "Maven Plugin Tools APIs"
DESCRIPTION = "The Maven Plugin Tools API provides an API to extract information from \
and generate documentation for Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-api-3.6.0-6.1.noarch.rpm"
RPM_HASH = "ef34fa51eee77014076ecda3f846e1a5b9ace732be988f52ff971cc6e7f346dee0d5257c3fa8eac91f2458795c0916eae7279f8d2a0b7e1637898415cf039ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
