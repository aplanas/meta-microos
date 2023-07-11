SUMMARY = "Maven Plugin Tools APIs"
DESCRIPTION = "The Maven Plugin Tools API provides an API to extract information from \
and generate documentation for Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-api-3.6.0-5.2.noarch.rpm"
RPM_HASH = "7e35d36f1ed8d3f2d87445f05969de2d8eac0f23d7342bca87083dc8de3979faf0f6e310768a70b014d266d765ce6762cae7d9e7eab899c9af9256fb27e08f6c"
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
