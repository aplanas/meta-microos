SUMMARY = "Apache Maven Artifact Resolver library"
DESCRIPTION = "Apache Maven Artifact Resolver is a library for working with artifact \
repositories and dependency resolution. Maven Artifact Resolver deals with the \
specification of local repository, remote repository, developer workspaces, \
artifact transports and artifact resolution."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-1.9.8-1.1.noarch.rpm"
RPM_HASH = "e311ac152104be365669ef29c412325caf8e01c6eff3c4201ea957689ea7a8e694ff5eb71cf8ce2fe8f47dc4b15823aeac7e51f76e0572bf63526098839d1f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver \
mvn-org.apache.maven.resolver-maven-resolver-pom- \
mvn-org.eclipse.aether-aether-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
