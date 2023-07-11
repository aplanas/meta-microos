SUMMARY = "Maven Ant Mojo Support"
DESCRIPTION = "This package provides Maven Ant Mojo Support, which write Maven plugins with \
Ant scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-ant-3.6.0-5.2.noarch.rpm"
RPM_HASH = "4914513b376ea5e7528db8df127c196927ed5bc58bb48b7983a3bd750e908e533571444b209495e08038c374d871c89acd718851dd3210ab2b80c97cc71bbac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-ant \
mvn-org.apache.maven.plugin-tools-maven-script-ant \
mvn-org.apache.maven.plugin-tools-maven-script-ant-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-launcher \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-ant-factory \
mvn-org.codehaus.plexus-plexus-archiver"

inherit rpm
