SUMMARY = "Apache Maven Artifact Resolver library"
DESCRIPTION = "Apache Maven Artifact Resolver is a library for working with artifact \
repositories and dependency resolution. Maven Artifact Resolver deals with the \
specification of local repository, remote repository, developer workspaces, \
artifact transports and artifact resolution."
LICENSE = "Apache-2.0"

PV = "1.9.12"

RPM_NAME = "maven-resolver-1.9.12-1.1.noarch.rpm"
RPM_HASH = "ae49e9b488dfba17ac7aab73eb98ae908711a330f9d005e44c7efb76a2e7121770338fa81a950f15e3e1820080f6ec92f70b8e658c06a6be28d073a7b4c1e248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver \
mvn-org.apache.maven.resolver-maven-resolver-pom- \
mvn-org.eclipse.aether-aether-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
