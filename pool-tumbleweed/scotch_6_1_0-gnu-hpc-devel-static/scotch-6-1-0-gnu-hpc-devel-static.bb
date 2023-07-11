SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch_6_1_0-gnu-hpc-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "5034532580fa8c2e65a3f26fec9f677f54c981ba27d833e62450f173373e0513091b7b95cc16d340dafe0230ce306307222285c62d8ffc30b577b66d6f403ba2"

RPROVIDES:${PN} += "scotch-6-1-0-gnu-hpc-devel-static"

RDEPENDS:${PN} += "scotch-6-1-0-gnu-hpc-devel"

inherit rpm
