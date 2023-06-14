SUMMARY = "Compatibility Maven toolchain artifact"
DESCRIPTION = "Maven toolchain artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-toolchain-2.2.1-3.8.noarch.rpm"
RPM_HASH = "e75ada6b989082450e1908e38f7a0d9a86c8c693fbd28ba07ba6eecf2d811e9bfb1c8f3f4a86778a9ce6b92f4fe8960e8595c452565f5c9f6e0c890c8edb1ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-toolchain \
mvn-org.apache.maven-maven-toolchain \
mvn-org.apache.maven-maven-toolchain-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core"

inherit rpm
