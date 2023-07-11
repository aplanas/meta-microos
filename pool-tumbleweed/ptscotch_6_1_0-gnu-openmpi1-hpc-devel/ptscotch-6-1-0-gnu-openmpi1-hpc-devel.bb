SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi1-hpc-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "5d7111f595a8ea3ddb645abc9d1af9f02dd68ca6e2cc6a560e1600f5cfff65c485bdfae298815d82fae29ca3b6324ee2c613b96d2f58b581d732988cf4d37227"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi1-hpc \
libz.so.1 \
openmpi1-gnu-hpc-devel"

inherit rpm
