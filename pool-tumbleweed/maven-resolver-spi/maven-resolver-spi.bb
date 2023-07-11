SUMMARY = "Maven Artifact Resolver SPI"
DESCRIPTION = "The service provider interface for repository system implementations and \
repository connectors."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-spi-1.9.12-1.1.noarch.rpm"
RPM_HASH = "6b2aed9e475ee1bc903db84269ed0e60da7091523710757b2b335fa2b7cf66f3e1eff06b7d6d9da0d5eb1a935a5d4beaac422d22a535889c5390671218257a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-spi-pom- \
mvn-org.eclipse.aether-aether-spi \
mvn-org.eclipse.aether-aether-spi-pom- \
osgi-org.apache.maven.resolver.spi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api"

inherit rpm
