SUMMARY = "Support for reading and writing YAML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing YAML encoded data. \
SnakeYAML library is used for low-level YAML parsing. This project adds \
necessary abstractions on top to make things work with other Jackson \
functionality."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-yaml-2.13.3-1.8.noarch.rpm"
RPM_HASH = "a328b487176a0f91bdc070324de23f63190e15bb39c9363920c222a4606fd7c4f50f96541993c6961f72ad94f9265f129521b4ef5b1c6e2350f3ef835d80a0f8"
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
