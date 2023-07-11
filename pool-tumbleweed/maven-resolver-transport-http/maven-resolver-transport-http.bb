SUMMARY = "Maven Artifact Resolver Transport HTTP"
DESCRIPTION = "A transport implementation for repositories using http:// and https:// URLs."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-transport-http-1.9.12-1.1.noarch.rpm"
RPM_HASH = "5aabf03388e1e8730081f820c3e665305a3e1953e96d97a4916f63bead5f8488a737eb7663d60bc5ab9da986f5716cafe0a0b1f6646f4709aa097706ff6b5e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-http \
mvn-org.apache.maven.resolver-maven-resolver-transport-http \
mvn-org.apache.maven.resolver-maven-resolver-transport-http-pom- \
mvn-org.eclipse.aether-aether-transport-http \
mvn-org.eclipse.aether-aether-transport-http-pom- \
osgi-org.apache.maven.resolver.transport.http"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
