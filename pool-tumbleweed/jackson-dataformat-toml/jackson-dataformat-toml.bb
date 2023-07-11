SUMMARY = "Support for reading and writing TOML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing TOML encoded data. \
This project adds necessary abstractions on top to make things work \
with other Jackson functionality."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-toml-2.13.3-1.8.noarch.rpm"
RPM_HASH = "b991afebbc1fb4208d923a761afad00f6ca45f5efacaf34ce47b66f3fccd81ddf2362a6da35dc562ed42ddb7390a8df09dfa7317097a635545cee1da6a3708ce"
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
