SUMMARY = "Maven Ant Mojo Support"
DESCRIPTION = "This package provides Maven Ant Mojo Support, which write Maven plugins with \
Ant scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-ant-3.6.0-7.1.noarch.rpm"
RPM_HASH = "203afc9d77568482a0af1d0f2ff539a6e87ddc3ccb7f16205b7152e3cfabe9be6fa7a963c2e5c3ee48a25de026757a170b71171e3bf70562e4c34a3dd0890460"
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
