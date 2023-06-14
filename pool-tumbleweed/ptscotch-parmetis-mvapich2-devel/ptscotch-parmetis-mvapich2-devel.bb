SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-mvapich2-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "c58d1d0ac3e8e8995031f84ec22547d7e9df04c13d2574f3bb59a7b115aeffaa41b172b72a7b01f49646c38c92999897a6c9ac7e1b093f6f6b67c51c1099e557"

RPROVIDES:${PN} += "ptscotch-parmetis-mvapich2-devel"

RDEPENDS:${PN} += "libptscotch0-mvapich2 \
ptscotch-mvapich2-devel"

inherit rpm
