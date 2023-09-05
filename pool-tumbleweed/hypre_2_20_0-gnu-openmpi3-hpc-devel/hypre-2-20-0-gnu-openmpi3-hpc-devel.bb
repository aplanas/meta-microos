SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi3 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi3-hpc-devel-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "d4deb8d7aabde1fdfff79a7b4b2906808bf2d5616503f5107f845e3642d7791861bf9f89957a47c27d6f2c4e93f8fed3f2a2f47803824df1e6be6b28a3400fb9"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi3-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi3-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi3-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
