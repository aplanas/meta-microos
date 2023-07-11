SUMMARY = "Maven Artifact Resolver Transport Classpath"
DESCRIPTION = "A transport implementation for repositories using classpath:// URLs."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-transport-classpath-1.9.12-1.1.noarch.rpm"
RPM_HASH = "a5e5bd77e823aa50cf288225a2f4eebdd6a0e2f6e12941a7b18b60da420821d735cbfe954e7946777b3f62a164fa55101ff327d72057fdb4ea8e6f1a7c661054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-classpath \
mvn-org.apache.maven.resolver-maven-resolver-transport-classpath \
mvn-org.apache.maven.resolver-maven-resolver-transport-classpath-pom- \
mvn-org.eclipse.aether-aether-transport-classpath \
mvn-org.eclipse.aether-aether-transport-classpath-pom- \
osgi-org.apache.maven.resolver.transport.classpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util"

inherit rpm
