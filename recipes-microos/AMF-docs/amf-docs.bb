SUMMARY = "Additional Documentation for the Advanced Media Framework (AMF) SDK"
DESCRIPTION = "This package contains additional documentation provided for the \
Advanced Media Framework (AMF) SDK."
LICENSE = "MIT"

PV = "1.4.26"

RPM_NAME = "AMF-docs-1.4.26-1.2.noarch.rpm"
RPM_HASH = "f7d2d88471c08c6e232c09245535e876cd60481d14a8266b110e3293e497d478d313fa6f3b712682238c1b1972d375a9c7f8924f3871097d4ade86a516a5fc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AMF-docs"
RDEPENDS:${PN} += ""

inherit rpm
