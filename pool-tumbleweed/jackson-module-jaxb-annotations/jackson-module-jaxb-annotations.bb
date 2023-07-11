SUMMARY = "Support for using JAXB annotations as an alternative to 'native' Jackson annotations"
DESCRIPTION = "This Jackson extension module provides support for using JAXB (javax.xml.bind) \
annotations as an alternative to native Jackson annotations. It is most often \
used to make it easier to reuse existing data beans that used with JAXB \
framework to read and write XML."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-jaxb-annotations-2.13.3-1.8.noarch.rpm"
RPM_HASH = "e29cd9b34e57050e87df7ce5037f4c1946b0bff36ecc764098102fa623ee8207845a8e5c9151ee01f0925a8e3832d47ffcfac6253850ada5d1561849bc366633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jaxb-annotations \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-jaxb-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-javax.activation-javax.activation-api \
mvn-javax.xml.bind-jaxb-api"

inherit rpm
