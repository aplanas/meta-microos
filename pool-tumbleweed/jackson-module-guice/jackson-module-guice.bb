SUMMARY = "Jackson module to make integration with Guice a bit easier"
DESCRIPTION = "This extension allows Jackson to delegate ObjectMapper creation and value \
injection to Guice when handling data bindings."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-guice-2.13.3-1.8.noarch.rpm"
RPM_HASH = "3a0ea54869977861e456e35fc7ea757dc6ca530cae130643be05a8ce2c319242c87299431ac4dd357c34231d19a070bfa1f79d01db541a8c47e112b2f8711088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-guice"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.inject-guice"

inherit rpm
