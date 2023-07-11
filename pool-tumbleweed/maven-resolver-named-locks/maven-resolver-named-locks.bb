SUMMARY = "Maven Artifact Resolver Named Locks"
DESCRIPTION = "A synchronization utility implementation using Named locks"
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-named-locks-1.9.12-1.1.noarch.rpm"
RPM_HASH = "16f2cf369cff487d49e75fe869ceac965f82d1bb156baa99904ecf9475cff61dd1638cf063531a27e3edf6e64a4ee1cc0980627ad04e5a7b18913e4b7bfb80a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-named-locks-pom- \
mvn-org.eclipse.aether-aether-named-locks \
mvn-org.eclipse.aether-aether-named-locks-pom- \
osgi-org.apache.maven.resolver.named.locks"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
