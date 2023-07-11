SUMMARY = "Development files for the Heaptrack API"
DESCRIPTION = "This package contains files needed to develop for the Heaptrack \
API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-devel-1.4.0-4.5.aarch64.rpm"
RPM_HASH = "031e3020fbb5d9ce32635f5f9cf2493a375cc6b2df484793e6d264243191b0faccd681b7c706b67617be83974cd794fbd286f74acd568081891a8308bc8bf21a"

RPROVIDES:${PN} += "heaptrack-devel"

RDEPENDS:${PN} += "heaptrack"

inherit rpm
