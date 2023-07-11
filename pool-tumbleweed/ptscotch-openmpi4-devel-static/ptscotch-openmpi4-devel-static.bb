SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi4-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "adf09059473aa89a719b71d20d0148b931b6d09912d21b65c01c8a68a721073e3b4f51b4bcff1a5f6229a2eae32d3ab492fe7aafd5d8fa92d5508272bf36ad0d"

RPROVIDES:${PN} += "ptscotch-openmpi4-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi4-devel"

inherit rpm
