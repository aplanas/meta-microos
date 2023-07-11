SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi4-hpc-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "797374b7e3fc5576a95c8db0b3a966aea384c7c34d66a3520458d1d97b8fc5d6eb68c3839aba9787675a8fc5d9be6c9807bb29143c3a8a247f795c65cde3edc6"

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
