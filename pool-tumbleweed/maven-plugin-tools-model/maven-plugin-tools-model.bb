SUMMARY = "Maven Plugin Metadata Model"
DESCRIPTION = "The Maven Plugin Metadata Model provides an API to play with the Metadata \
model."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-model-3.6.0-6.1.noarch.rpm"
RPM_HASH = "6560c7928115ac167386b1439a1bd21366ec32004aa9c8d5c77481d2a1d266f680ab0dc2467bfe21356ec48362afd018aa7ee0db57f7ee44605e8b2ce591554e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
