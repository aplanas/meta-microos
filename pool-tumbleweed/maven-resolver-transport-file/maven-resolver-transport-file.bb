SUMMARY = "Maven Artifact Resolver Transport File"
DESCRIPTION = "A transport implementation for repositories using file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-transport-file-1.9.12-1.1.noarch.rpm"
RPM_HASH = "56c507f61b2bdc92d37a93402624aca48089bbc853787ababd73ce6b68a629542dfe8341c27be79ce2d50fe0274e20c6b60a1500561e978c9b5c2e98876232a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-transport-file-pom- \
mvn-org.eclipse.aether-aether-transport-file \
mvn-org.eclipse.aether-aether-transport-file-pom- \
osgi-org.apache.maven.resolver.transport.file"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.slf4j-slf4j-api"

inherit rpm
