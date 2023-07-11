SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi1-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "a23bd5c000ed0f8dc065b1ee7d973ee8525a2a624e794ac95399b5315956be793c7c01a1ef245ae87f2d10e66a3e1ffddbf7b20cec1c2be9280c6313fc3cfc0e"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi1-devel"

RDEPENDS:${PN} += "libptscotch0-openmpi1 \
ptscotch-openmpi1-devel"

inherit rpm
