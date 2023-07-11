SUMMARY = "Apache Maven Ant Plugin"
DESCRIPTION = "The Ant Plugin generates build files for Ant 1.6.2 or above from the POM."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "maven-ant-plugin-2.4-3.11.noarch.rpm"
RPM_HASH = "3bcaa643613367f992dd8c70c94633155fb6bbf18dbb4678d57565be2abf3f91c9c86ff9b3213e5b32120738d7072edef2d20715ba1d2fddd7f951bc38c7ed97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-ant-plugin \
mvn-org.apache.maven.plugins-maven-ant-plugin \
mvn-org.apache.maven.plugins-maven-ant-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.maven-maven-artifact-2.2.1 \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model-2.2.1 \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven-maven-settings-2.2.1 \
mvn-org.codehaus.plexus-plexus-utils \
mvn-xalan-xalan \
mvn-xml-apis-xml-apis"

inherit rpm
