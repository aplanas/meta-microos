SUMMARY = "Parent POM files for geronimo-specs"
DESCRIPTION = "The Project Object Model files for the geronimo-specs modules."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "geronimo-specs-pom-1.6-3.5.noarch.rpm"
RPM_HASH = "c1e2897f7c625e5eee3f27c8d615c4fade545f73ddc75a6cae1f55d3c8325fe416feb157b4eaba8698ab525e8124f017c05d6154990e4328c7213d7764efe74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-specs-pom \
mvn-org.apache.geronimo.specs-specs-parent-pom- \
mvn-org.apache.geronimo.specs-specs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin"

inherit rpm
