SUMMARY = "General data-binding package for Jackson (2.x)"
DESCRIPTION = "The general-purpose data-binding functionality and tree-model for Jackson Data \
Processor. It builds on core streaming parser/generator package, and uses \
Jackson Annotations for configuration."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.13.4.2"

RPM_NAME = "jackson-databind-2.13.4.2-1.3.noarch.rpm"
RPM_HASH = "ac71d8a5256c6135c0b1ba2438ba2fd3200a1ce9ecbf62ff5b39edeae29df576eaf2329a331e1683faaa4a1ba21d8d55fcf537fa6093d63ae11bb39ccd8da179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.core-jackson-databind-pom- \
osgi-com.fasterxml.jackson.core.jackson-databind"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
