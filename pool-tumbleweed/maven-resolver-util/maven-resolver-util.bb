SUMMARY = "Maven Artifact Resolver Utilities"
DESCRIPTION = "A collection of utility classes to ease usage of the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-util-1.9.8-1.1.noarch.rpm"
RPM_HASH = "dc4baf9618e9fd47bc1b9dcd4245a65edaa1e0f32463465d5a39f0da4879a36231d40d0e5eecbd43b4c8d5b146e4f9f615756efc919ee08c5e1c87b9fa302c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-util \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.resolver-maven-resolver-util-pom- \
mvn-org.eclipse.aether-aether-util \
mvn-org.eclipse.aether-aether-util-pom- \
osgi-org.apache.maven.resolver.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api"

inherit rpm
