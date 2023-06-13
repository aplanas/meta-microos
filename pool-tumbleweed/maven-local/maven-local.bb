SUMMARY = "Local mode for Maven"
DESCRIPTION = "This meta-package pulls in macros, scripts and dependencies \
implementing local mode for Maven, which allows artifact \
resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "maven-local-6.1.0-1.2.noarch.rpm"
RPM_HASH = "a5ce36f7f4b282acb2b3847f2283db2d92239e419f9c4592b162b8c72a04e577ad098ed97a82ae9d019c0379247edf8cb0c6a51354f1409434e2aff7c44b8664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-local"

RDEPENDS:${PN} += "javapackages-local \
javapackages-tools \
mvn(junit:junit) \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache.maven.plugins:maven-jar-plugin) \
mvn(org.apache.maven.plugins:maven-javadoc-plugin) \
mvn(org.apache.maven.plugins:maven-resources-plugin) \
mvn(org.apache.maven.plugins:maven-surefire-plugin) \
mvn(org.apache.maven.surefire:surefire-junit4) \
mvn(org.apache.maven.surefire:surefire-testng) \
xmvn-connector-aether \
xmvn-install \
xmvn-minimal \
xmvn-mojo \
xmvn-resolve"

inherit rpm
