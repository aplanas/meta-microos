SUMMARY = "Maven Artifact Resolver Named Locks"
DESCRIPTION = "A synchronization utility implementation using Named locks"
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-named-locks-1.9.8-1.1.noarch.rpm"
RPM_HASH = "ff83739e907f52e694b6cd4e3f91166ab593f6b3837b62a757bd6563923aed6b7e312ebcfe174caa7e2a74a54f8a539a84bfa327f01295308356e59f42d9ba3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-named-locks \
mvn(org.apache.maven.resolver:maven-resolver-named-locks) \
mvn(org.apache.maven.resolver:maven-resolver-named-locks:pom:) \
mvn(org.eclipse.aether:aether-named-locks) \
mvn(org.eclipse.aether:aether-named-locks:pom:) \
osgi(org.apache.maven.resolver.named.locks)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.slf4j:slf4j-api)"

inherit rpm
