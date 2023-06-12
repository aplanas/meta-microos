SUMMARY = "Maven Artifact Resolver Test Utilities"
DESCRIPTION = "A collection of utility classes to ease testing of the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-test-util-1.9.8-1.1.noarch.rpm"
RPM_HASH = "95bd427be8d44948207039275f599bfaaf4d619d89ce1b0af8e4cb386c5c5dd10fe1b3d30212557bc33a8a56dfb1560beb9fe1d716bfe04604c71ff38f6d5c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-test-util \
mvn(org.apache.maven.resolver:maven-resolver-test-util) \
mvn(org.apache.maven.resolver:maven-resolver-test-util:pom:) \
mvn(org.eclipse.aether:aether-test-util) \
mvn(org.eclipse.aether:aether-test-util:pom:) \
osgi(org.apache.maven.resolver.test.util)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.resolver:maven-resolver-api) \
mvn(org.apache.maven.resolver:maven-resolver-spi)"

inherit rpm
