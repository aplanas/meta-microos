SUMMARY = "Maven Plugin Tool for Ant"
DESCRIPTION = "Descriptor extractor for plugins written in Ant."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-ant-3.6.0-7.1.noarch.rpm"
RPM_HASH = "577cbd63a3f75ede2b517a6b2cda175330d9dbd03c7aa733ee2171e87a2e5295b4302d47926761e635fb4dfd9e83075ca57a7e288c7bb48d9dbb5b3a4d2ebc57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-ant \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-ant \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-ant-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
