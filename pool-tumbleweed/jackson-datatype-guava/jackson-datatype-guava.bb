SUMMARY = "Add-on module for Jackson which handles Guava data-types"
DESCRIPTION = "Add-on datatype-support module for Jackson that handles \
Guava types (currently mostly just collection ones)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatype-guava-2.13.3-1.8.noarch.rpm"
RPM_HASH = "0bc80ac095b6084c7c5191fa683f3d8fd43e0245b7504427a4827844892beed3745b57083a50720883f34f553230a4ded5237c8a75390f7e3f3d0d0d13e0ec7d"
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
