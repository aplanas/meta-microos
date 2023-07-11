SUMMARY = "Maven Artifact Resolver Transport Wagon"
DESCRIPTION = "A transport implementation based on Maven Wagon."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-transport-wagon-1.9.12-1.1.noarch.rpm"
RPM_HASH = "49c2d787387771870126797c1a8b25028828eaa148bc8b2e8e0c59da5216fc4de364d239495b942509581721f8a4cd7ba69cfcc0296fdc6929dce3abfa8db778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-wagon \
mvn-org.apache.maven.resolver-maven-resolver-transport-wagon \
mvn-org.apache.maven.resolver-maven-resolver-transport-wagon-pom- \
mvn-org.eclipse.aether-aether-connector-wagon \
mvn-org.eclipse.aether-aether-connector-wagon-pom- \
mvn-org.eclipse.aether-aether-transport-wagon \
mvn-org.eclipse.aether-aether-transport-wagon-pom- \
osgi-org.apache.maven.resolver.transport.wagon"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.slf4j-slf4j-api"

inherit rpm
