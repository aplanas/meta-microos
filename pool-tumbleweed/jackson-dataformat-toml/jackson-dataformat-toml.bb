SUMMARY = "Support for reading and writing TOML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing TOML encoded data. \
This project adds necessary abstractions on top to make things work \
with other Jackson functionality."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-toml-2.15.2-2.1.noarch.rpm"
RPM_HASH = "97a8f8a8cb92269eb69c3dd054259c512577145fbfeab7cd7fb5de442d73bb3bd48a367baaed6c824df242d083a0ba80f39428f605b35eedc7fb67499e134270"
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
