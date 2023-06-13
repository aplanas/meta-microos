SUMMARY = "Documentation files for kanku"
DESCRIPTION = "This package contains the documentation files for kanku."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-doc-0.14.0-1.3.noarch.rpm"
RPM_HASH = "25713e08961e97c353bc2f15907182fd4c518ac815e781ce5dad88892059bca467b22ce25ecfa35718afd8b02c6c7ae389af83b4f7bae0ae47e0f9465b6f2f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-doc"

RDEPENDS:${PN} += ""

inherit rpm
