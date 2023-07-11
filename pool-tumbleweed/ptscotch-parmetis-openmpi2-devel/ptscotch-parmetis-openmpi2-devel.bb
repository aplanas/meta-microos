SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi2-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "de05f00254e1d5e14ee03cb8d0ffa5c5377ac2b23f9785cd46af8dbd3715fe5dc8ce2e012bc52863b1225930c293d34ce21ae9f0929571e10268a0c1dab88019"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi2-devel"

RDEPENDS:${PN} += "libptscotch0-openmpi2 \
ptscotch-openmpi2-devel"

inherit rpm
