SUMMARY = "Apache Maven Ant Plugin"
DESCRIPTION = "The Ant Plugin generates build files for Ant 1.6.2 or above from the POM."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "maven-ant-plugin-2.4-3.10.noarch.rpm"
RPM_HASH = "fa1b8ac7fda897abb1b66f1f534490c78964785347e9c24db509daaeb4f0fc4ae2c68af1dbf8836ebdd4038a291e9f7ae5cacd816ebd49647aa37b5626c01658"
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
