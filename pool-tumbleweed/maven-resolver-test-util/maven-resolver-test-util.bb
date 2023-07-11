SUMMARY = "Maven Artifact Resolver Test Utilities"
DESCRIPTION = "A collection of utility classes to ease testing of the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-test-util-1.9.12-1.1.noarch.rpm"
RPM_HASH = "241f4c5f1560b95a685a1a46138b3d6eac62e64c8da3e382e322c75411ce7c4829a1b2249b12fbedcd53d97a4bba0f2b79e7d36a0bdb4d8392187cf5679911cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-test-util \
mvn-org.apache.maven.resolver-maven-resolver-test-util \
mvn-org.apache.maven.resolver-maven-resolver-test-util-pom- \
mvn-org.eclipse.aether-aether-test-util \
mvn-org.eclipse.aether-aether-test-util-pom- \
osgi-org.apache.maven.resolver.test.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi"

inherit rpm
