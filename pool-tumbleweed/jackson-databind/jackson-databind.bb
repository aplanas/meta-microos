SUMMARY = "General data-binding package for Jackson (2.x)"
DESCRIPTION = "The general-purpose data-binding functionality and tree-model for Jackson Data \
Processor. It builds on core streaming parser/generator package, and uses \
Jackson Annotations for configuration."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.15.2"

RPM_NAME = "jackson-databind-2.15.2-1.1.noarch.rpm"
RPM_HASH = "707baacbdd454cbbd468b3d595c1ad1806902746d91aba92f3e535cb7f75d15556beea61231d51591f9ce049e4c4c8dc7f1d3f84fa6e9b69a32f78d53e3ec394"
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
