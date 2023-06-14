SUMMARY = "Maven Plugin Tools APIs"
DESCRIPTION = "The Maven Plugin Tools API provides an API to extract information from \
and generate documentation for Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-api-3.6.0-5.1.noarch.rpm"
RPM_HASH = "250654010d975f490045962d147fbde934919fd3256410131e2ec4a0a409062b537897ec8aaa0229283661517faac04d868c99d8619094face2fe7ae680460d8"
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
