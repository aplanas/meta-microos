SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mvapich2-hpc-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "1c13154aaf5020756fcb9ef68cdbd7a941d9262c986dbe9de443bcd25430f01bd974e61406121f5cbc6dfdc7fa1c7eb18d61e37c3f30d7c93602bd440c4aceed"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libptscotch-6-1-0-gnu-mvapich2-hpc \
libz.so.1 \
mvapich2-gnu-hpc-devel"

inherit rpm
