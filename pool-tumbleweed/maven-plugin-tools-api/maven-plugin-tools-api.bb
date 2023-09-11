SUMMARY = "Maven Plugin Tools APIs"
DESCRIPTION = "The Maven Plugin Tools API provides an API to extract information from \
and generate documentation for Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-api-3.6.0-7.1.noarch.rpm"
RPM_HASH = "297ebbf336c8bc4cff9b17af11d48f8b6a599a852c7dda48000805aa42a66751e2c58994cb9a7eee7631616ed708c6cb8d9454db165a57ef2e5a95f2955d9f4f"
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
