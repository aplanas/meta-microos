SUMMARY = "Support for reading and writing TOML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing TOML encoded data. \
This project adds necessary abstractions on top to make things work \
with other Jackson functionality."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-toml-2.15.2-1.1.noarch.rpm"
RPM_HASH = "2ab00144a9b5c5ef02ef5a9623ac954e54efa9a3b7b7ed1e85ffb1c1e98c9c8fed2391c3d47f205c792565924af953820d193219d401f704cdca555961b03d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-toml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-toml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-toml-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-toml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
