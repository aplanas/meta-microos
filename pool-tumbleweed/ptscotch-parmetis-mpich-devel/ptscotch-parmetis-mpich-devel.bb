SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-mpich-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "365ea1979394e1b8cd164980ed480680c52f62dbe4e562a973ead6c269c805f886df83060d60bab3c9a8ca02bfe4680d01b118eeb07a6f9aad129a72df04f295"

RPROVIDES:${PN} += "ptscotch-parmetis-mpich-devel \
ptscotch-parmetis-mpich-devel(aarch-64)"
RDEPENDS:${PN} += "libptscotch0-mpich \
ptscotch-mpich-devel"

inherit rpm
