SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mpich-hpc-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "3ee828e15bb8cf6b1e221b903275574a6a69da81c9fe42cc2226d3c6ad3c66635f9221d61ecf0ea953dd06088db129be7c270106dccb53ec73698a029af5022d"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-mpich-hpc-devel \
ptscotch_6_1_0-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libptscotch_6_1_0-gnu-mpich-hpc \
libz.so.1()(64bit) \
mpich-gnu-hpc-devel"

inherit rpm
