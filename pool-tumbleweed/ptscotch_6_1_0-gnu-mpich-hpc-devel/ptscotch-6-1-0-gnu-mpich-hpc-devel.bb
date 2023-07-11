SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mpich-hpc-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "d0a82c2a95653b2775d47ce72e1e33e3b0a52c08981c36a0cdb7ab33e7b13291bbe32d65e8e89e3b6792fcbafa8a5112a62aa18749010e7169e9ae10abf13a24"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libptscotch-6-1-0-gnu-mpich-hpc \
libz.so.1 \
mpich-gnu-hpc-devel"

inherit rpm
