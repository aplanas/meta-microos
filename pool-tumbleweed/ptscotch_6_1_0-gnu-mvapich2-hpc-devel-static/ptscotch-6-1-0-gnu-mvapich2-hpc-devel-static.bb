SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mvapich2-hpc-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "dfad561733074cc5498ce6707aa398de9552de091b039cb8a4b83889bd3a50fa2aff575b488129aabeb92a977c13fa7958c50c47a109636662f531ced8961b40"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-mvapich2-hpc-devel"

inherit rpm
