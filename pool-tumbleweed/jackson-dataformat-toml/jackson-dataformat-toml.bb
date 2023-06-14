SUMMARY = "Support for reading and writing TOML-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson extension component for reading and writing TOML encoded data. \
This project adds necessary abstractions on top to make things work \
with other Jackson functionality."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-toml-2.13.3-1.7.noarch.rpm"
RPM_HASH = "1e96843e2dba755b43702a3fb3a2f9e42629166499bc6a29cf330c5181fbc0ab3e4554183283869811b4e432c30c63ba879aa2d03d007a345a835e28b50b58fe"
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
