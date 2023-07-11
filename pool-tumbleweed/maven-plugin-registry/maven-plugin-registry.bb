SUMMARY = "Compatibility Maven plugin registry artifact"
DESCRIPTION = "Maven plugin registry artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-plugin-registry-2.2.1-3.9.noarch.rpm"
RPM_HASH = "92c23675b7ec7554aecbc5f7bc2370ecebff8106b5e82a8eec6810a448b96809ee431c576620dcacab3adfbe7fbf148d75113e205be229dd41f9b8d4562f2137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-registry \
mvn-org.apache.maven-maven-plugin-registry \
mvn-org.apache.maven-maven-plugin-registry-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
