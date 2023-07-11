SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "2ceaf8b44df6d3df650befaafe2fbea92cedf6c8832510c2f70a35820edefbbc46313d6555c13994586e21b73b5a2a0170edc09248c8c8684bb4e2b16fa543e2"

RPROVIDES:${PN} += "scotch-devel-static"

RDEPENDS:${PN} += "scotch-devel"

inherit rpm
