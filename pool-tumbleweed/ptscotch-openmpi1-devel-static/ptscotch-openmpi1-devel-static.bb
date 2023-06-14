SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi1-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "92d0ab8af95b0fd541ea5586bb46f264d29d7b937a3a8edc5faca2b3701ed102b0119c29b2129a989951533db928f86d67cf57b88f384426c6eb03d93211e56f"

RPROVIDES:${PN} += "ptscotch-openmpi1-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi1-devel"

inherit rpm
