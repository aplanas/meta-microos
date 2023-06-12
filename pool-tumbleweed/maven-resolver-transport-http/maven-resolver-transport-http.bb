SUMMARY = "Maven Artifact Resolver Transport HTTP"
DESCRIPTION = "A transport implementation for repositories using http:// and https:// URLs."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-transport-http-1.9.8-1.1.noarch.rpm"
RPM_HASH = "545a0764be62c200861d64a210a4e943a889d78f0ded47a6d9495f2b94c31427df4cfac2556ad1857edf368b7182314bb4bba5e0e578be2d5eb4a72e4690f1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-http \
mvn(org.apache.maven.resolver:maven-resolver-transport-http) \
mvn(org.apache.maven.resolver:maven-resolver-transport-http:pom:) \
mvn(org.eclipse.aether:aether-transport-http) \
mvn(org.eclipse.aether:aether-transport-http:pom:) \
osgi(org.apache.maven.resolver.transport.http)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.httpcomponents:httpclient) \
mvn(org.apache.httpcomponents:httpcore) \
mvn(org.apache.maven.resolver:maven-resolver-api) \
mvn(org.apache.maven.resolver:maven-resolver-spi) \
mvn(org.apache.maven.resolver:maven-resolver-util) \
mvn(org.slf4j:jcl-over-slf4j) \
mvn(org.slf4j:slf4j-api)"

inherit rpm
