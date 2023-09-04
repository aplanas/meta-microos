SUMMARY = "Add-on module for Jackson which handles Guava data-types"
DESCRIPTION = "Add-on datatype-support module for Jackson that handles \
Guava types (currently mostly just collection ones)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatype-guava-2.15.2-1.1.noarch.rpm"
RPM_HASH = "3a91f04314819130a7cd41de778b6210d44910140b9d18de85421e9795f065d41ab57473976ad4391a4ae489eded8776c978c2a0bb85bf9d489c0f1361242668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-guava \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-guava \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-guava-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.guava-guava"

inherit rpm
