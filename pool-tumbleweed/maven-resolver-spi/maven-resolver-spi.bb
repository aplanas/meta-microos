SUMMARY = "Maven Artifact Resolver SPI"
DESCRIPTION = "The service provider interface for repository system implementations and \
repository connectors."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-spi-1.9.8-1.1.noarch.rpm"
RPM_HASH = "21c6fbb645d0fd9185453da4918fe3adebe2ecbf34363a95628dbc1a835cefe7f7b146b739b544645c879fc3d89c78abe5855b12d64f53aac0613accc5e88230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-spi \
mvn(org.apache.maven.resolver:maven-resolver-spi) \
mvn(org.apache.maven.resolver:maven-resolver-spi:pom:) \
mvn(org.eclipse.aether:aether-spi) \
mvn(org.eclipse.aether:aether-spi:pom:) \
osgi(org.apache.maven.resolver.spi)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.resolver:maven-resolver-api)"

inherit rpm
