SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mvapich2-hpc-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "683a561a39e464daf21db7ca4af5303624679536b140802cd1206d8379a70a409b2f66e2a68bd2643ca440fc5493920e4281093d39ee1768afc80b83e3612d4f"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-mvapich2-hpc-devel"

inherit rpm
