SUMMARY = "Maven Plugin Metadata Model"
DESCRIPTION = "The Maven Plugin Metadata Model provides an API to play with the Metadata \
model."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-model-3.6.0-5.2.noarch.rpm"
RPM_HASH = "fd7f49598d147df9130b77c3f442173f08531e11f6b65f7084d5a6fd5866744e3e5f784c6d7ea53ee1089e569e1af06213d2de068e4355f07e452ab8b5124983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
