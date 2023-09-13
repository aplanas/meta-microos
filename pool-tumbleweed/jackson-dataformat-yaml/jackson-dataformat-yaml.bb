SUMMARY = "Support for reading and writing YAML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing YAML encoded data. \
SnakeYAML library is used for low-level YAML parsing. This project adds \
necessary abstractions on top to make things work with other Jackson \
functionality."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-yaml-2.15.2-2.1.noarch.rpm"
RPM_HASH = "aae4ac4de46531918861661a157a4f9e334d815398754bfe936430c180c2b66e41c4e720569d482a10c381bf4896e76ee7f43426aee8cea68ea098aa82ee7bf4"
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
