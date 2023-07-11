SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mpich-hpc-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "81f571e03831b241df502e88a0ac71a10a5ba1cffc63e5952ef74d3aa96cbff41fd950327a22a7bcb8c88240db2462bd7af3904870f65e909710a241ab92fadb"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-mpich-hpc-devel"

inherit rpm
