SUMMARY = "Compatibility Maven toolchain artifact"
DESCRIPTION = "Maven toolchain artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-toolchain-2.2.1-3.9.noarch.rpm"
RPM_HASH = "56e7c5aae0cb7e2638fdc4f94f5c7146ab7b6fb4964e56aafa662386851245eaee25c29086efc67f7574fc5faf474652f132bc203dbcf6e460f42f24495ab38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-toolchain \
mvn-org.apache.maven-maven-toolchain \
mvn-org.apache.maven-maven-toolchain-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core"

inherit rpm
