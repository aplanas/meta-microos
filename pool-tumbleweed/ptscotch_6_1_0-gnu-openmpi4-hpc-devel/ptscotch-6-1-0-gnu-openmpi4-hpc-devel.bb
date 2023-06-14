SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi4-hpc-devel-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "cb1ac9de3ee418357ecebc7f3175a389b22954a3d4f3a0481051d3e8c06b5d0c72b58184c7a0a44baa6345e49c791b5a58ccff594cae4e8512e3165d7b2ee6e8"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi4-hpc \
libz.so.1 \
openmpi4-gnu-hpc-devel"

inherit rpm
