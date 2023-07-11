SUMMARY = "Maven Artifact Resolver API"
DESCRIPTION = "The application programming interface for the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-api-1.9.12-1.1.noarch.rpm"
RPM_HASH = "cf9b5b211270d67d0562974671244964e188048660e39d12184366346d053ce2a9839495ad4f378d8810d8d53788ca5a3a1a10adde604f20a1f67dce642d91b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-api-pom- \
mvn-org.eclipse.aether-aether-api \
mvn-org.eclipse.aether-aether-api-pom- \
osgi-org.apache.maven.resolver.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
