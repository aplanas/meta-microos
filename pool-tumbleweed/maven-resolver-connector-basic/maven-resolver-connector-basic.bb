SUMMARY = "Maven Artifact Resolver Connector Basic"
DESCRIPTION = "A repository connector implementation for repositories using URI-based layouts."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-connector-basic-1.9.12-1.1.noarch.rpm"
RPM_HASH = "e4f8ce0bd9d63b3353922bd0173fb4a2fa95defb0f2b60ea1e1f3428d5b2209c009270c9d8b83334abeb2a4c19167da7ff9ec9ca05ddb36f1808eba51dd211d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic-pom- \
mvn-org.eclipse.aether-aether-connector-basic \
mvn-org.eclipse.aether-aether-connector-basic-pom- \
osgi-org.apache.maven.resolver.connector.basic"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
