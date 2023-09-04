SUMMARY = "Support for reading and writing YAML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing YAML encoded data. \
SnakeYAML library is used for low-level YAML parsing. This project adds \
necessary abstractions on top to make things work with other Jackson \
functionality."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-yaml-2.15.2-1.1.noarch.rpm"
RPM_HASH = "0af58b23004e0bb8ab2fe39ff3e4deb7a96e373f3e2206b082a8aadfa2e9c9d6a7bc68167f2fdd151f6c51331b5fab22232bab81fbc41241c1493e97a1f80859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-yaml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-yaml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-yaml-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-yaml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.yaml-snakeyaml"

inherit rpm
