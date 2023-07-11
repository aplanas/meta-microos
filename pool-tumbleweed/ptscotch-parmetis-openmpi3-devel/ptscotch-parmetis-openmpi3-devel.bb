SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi3-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "4b4ad647252a37d917b20fa243172bcffbfbeeb22a706c19c97de74af3134d459f89224df33f90db7d5262d3df6960f84c804153ffe5cee90ec59818172342b9"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi3-devel"

RDEPENDS:${PN} += "libptscotch0-openmpi3 \
ptscotch-openmpi3-devel"

inherit rpm
