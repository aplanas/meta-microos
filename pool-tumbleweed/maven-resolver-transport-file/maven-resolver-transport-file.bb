SUMMARY = "Maven Artifact Resolver Transport File"
DESCRIPTION = "A transport implementation for repositories using file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-transport-file-1.9.8-1.1.noarch.rpm"
RPM_HASH = "68c271973e562e7b1447aba3dcbd68d418f5c4884cad90c416ad7548679114b7f6ed71811e995aef79960b0145e104a1665b0ee7c4beec64731a235f743018e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-file \
mvn(org.apache.maven.resolver:maven-resolver-transport-file) \
mvn(org.apache.maven.resolver:maven-resolver-transport-file:pom:) \
mvn(org.eclipse.aether:aether-transport-file) \
mvn(org.eclipse.aether:aether-transport-file:pom:) \
osgi(org.apache.maven.resolver.transport.file)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.resolver:maven-resolver-api) \
mvn(org.apache.maven.resolver:maven-resolver-spi) \
mvn(org.slf4j:slf4j-api)"

inherit rpm
