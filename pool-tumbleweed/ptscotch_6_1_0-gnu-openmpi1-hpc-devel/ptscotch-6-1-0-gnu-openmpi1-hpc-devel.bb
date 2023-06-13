SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi1-hpc-devel-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "1c226d9caa6d59bc58f6474c72cf468c66924720d9bd3d2c2cb33d1277f17d2f1b20a22ff7a66af52ddaac3c0eb3d6fa262f1b7f4ad44c504a9435dab1028bc4"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi1-hpc-devel \
ptscotch_6_1_0-gnu-openmpi1-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libptscotch_6_1_0-gnu-openmpi1-hpc \
libz.so.1()(64bit) \
openmpi1-gnu-hpc-devel"

inherit rpm
