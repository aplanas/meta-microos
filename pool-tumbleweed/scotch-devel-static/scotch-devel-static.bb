SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "29a52c9ce6cc464005f72a3a1b3d9d2951b37a576d8db75a1fdcfb328862a9b1cb2aaeaf3787c197b63dcc7f3b38b65157110b2e65cb4f85bac41fd3a0d8a555"

RPROVIDES:${PN} += "scotch-devel-static"

RDEPENDS:${PN} += "scotch-devel"

inherit rpm
