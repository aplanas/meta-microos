SUMMARY = "Add-on module for Jackson which handles Guava data-types"
DESCRIPTION = "Add-on datatype-support module for Jackson that handles \
Guava types (currently mostly just collection ones)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatype-guava-2.15.2-2.1.noarch.rpm"
RPM_HASH = "8815588b77033b6fac203b36a5a1f5925f632c1db5b388f81aa4029b1c24a4c03482d193f9f441ad58cd63f0ed5219e20f5a2398517a0034cb5651afa96a96be"
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
