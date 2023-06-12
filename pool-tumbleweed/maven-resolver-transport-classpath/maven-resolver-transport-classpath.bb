SUMMARY = "Maven Artifact Resolver Transport Classpath"
DESCRIPTION = "A transport implementation for repositories using classpath:// URLs."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-transport-classpath-1.9.8-1.1.noarch.rpm"
RPM_HASH = "5e2ec12439ef7365201919c7753c486950f892e5e53d0816c0d3d2c715bc32320cea45997cdf4ce702de6974d2ddb69feffd8e63efa4a5dda1bd7df1c8400bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-classpath \
mvn(org.apache.maven.resolver:maven-resolver-transport-classpath) \
mvn(org.apache.maven.resolver:maven-resolver-transport-classpath:pom:) \
mvn(org.eclipse.aether:aether-transport-classpath) \
mvn(org.eclipse.aether:aether-transport-classpath:pom:) \
osgi(org.apache.maven.resolver.transport.classpath)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.resolver:maven-resolver-api) \
mvn(org.apache.maven.resolver:maven-resolver-spi) \
mvn(org.apache.maven.resolver:maven-resolver-util)"

inherit rpm
