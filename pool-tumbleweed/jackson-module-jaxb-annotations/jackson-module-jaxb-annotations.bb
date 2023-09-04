SUMMARY = "Support for using JAXB annotations as an alternative to 'native' Jackson annotations"
DESCRIPTION = "This Jackson extension module provides support for using JAXB (javax.xml.bind) \
annotations as an alternative to native Jackson annotations. It is most often \
used to make it easier to reuse existing data beans that used with JAXB \
framework to read and write XML."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-jaxb-annotations-2.15.2-1.1.noarch.rpm"
RPM_HASH = "022878af1acfb5d2e822ec5a54911ce0b596f5e4d9130ee06e2fa5da283cbfd1125ec04bdb7b1d94443df0417c3c7612c7c16db34d79d2261a6e938f8264e291"
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
