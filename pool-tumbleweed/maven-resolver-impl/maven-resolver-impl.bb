SUMMARY = "Maven Artifact Resolver Implementation"
DESCRIPTION = "An implementation of the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-impl-1.9.12-1.1.noarch.rpm"
RPM_HASH = "5035408bb4e1205da7ead059f10693d41602af4f399ffaaa6d638a00204b417cfcd143dd50035288b8da8bae1a859903828677dd18a9e830a8d333d1bd11c9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-impl-pom- \
mvn-org.eclipse.aether-aether-impl \
mvn-org.eclipse.aether-aether-impl-pom- \
osgi-org.apache.maven.resolver.impl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
