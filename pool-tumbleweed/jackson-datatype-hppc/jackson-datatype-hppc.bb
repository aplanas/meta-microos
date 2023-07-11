SUMMARY = "Add-on module for Jackson to support HPPC data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and \
deserialization of High-Performance Primitive Collections \
data-types."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatype-hppc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "b0feb8d5765e9f1d134398f5dd14a88333136de419c65a9b18e6a983ebd1f94268975b6262859f795026c62a9611f5bf1b9ef26b46acea3ca14e4342ad9b5cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-hppc \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-hppc \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-hppc-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-hppc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.carrotsearch-hppc \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
