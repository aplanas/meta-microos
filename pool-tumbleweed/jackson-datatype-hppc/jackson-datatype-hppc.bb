SUMMARY = "Add-on module for Jackson to support HPPC data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and \
deserialization of High-Performance Primitive Collections \
data-types."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatype-hppc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "a04337c65632000665885790ba745673d0d97c2b2f84a9e85a2c27882ca370929f9c78bf3f84eec719b2009aacf9782f64f728fbb877e7800aa9d56d07cc89a0"
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
