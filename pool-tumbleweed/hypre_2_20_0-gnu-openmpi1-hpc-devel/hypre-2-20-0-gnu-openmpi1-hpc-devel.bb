SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi1 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi1-hpc-devel-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "d0fdd7e8825715e5571a8877e128da0cfce6a312c41c7a7b0accaed3a9e7551a25054bc42293722a21a737deac73da02321645169715ff4a6db14c1c02c4d265"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi1-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi1-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi1-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
