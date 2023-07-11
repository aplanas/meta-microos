SUMMARY = "Maven Artifact Resolver Utilities"
DESCRIPTION = "A collection of utility classes to ease usage of the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-util-1.9.12-1.1.noarch.rpm"
RPM_HASH = "3bd26c834edea35c7c6a7eaf43b142ee6c6b5d17903db9e273cec4e31f600f04e5931df49d41f49803ccfac0651bff29d5e1b6af6e8687759952ee675ed07dd8"
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
