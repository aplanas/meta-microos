SUMMARY = "A build rule execution framework"
DESCRIPTION = "Enforcer is a build rule execution framework."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-1.4.1-3.10.noarch.rpm"
RPM_HASH = "c81a9e7230471974216cd9b69739b79084c1d1b14bfbcd5f0c59aad93ed2a9547a3c6ba0a8217ff1a39a24256719546b2d473642e00cc594e2c4f5aa32a7796f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer \
mvn-org.apache.maven.enforcer-enforcer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom-"

inherit rpm
