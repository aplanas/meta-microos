SUMMARY = "Support for reading and writing YAML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing YAML encoded data. \
SnakeYAML library is used for low-level YAML parsing. This project adds \
necessary abstractions on top to make things work with other Jackson \
functionality."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-yaml-2.13.3-1.7.noarch.rpm"
RPM_HASH = "64c8aa4f2df7de9e3d48efbc5b35c02d6fd83ce5212cf09cbdcfd5b98e3659b8dc7a8447976fd420a38ea9d20281818578c48e3a342657113c19318a3c6a9e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-yaml \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-yaml) \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:pom:) \
osgi(com.fasterxml.jackson.dataformat.jackson-dataformat-yaml)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(org.yaml:snakeyaml)"

inherit rpm
