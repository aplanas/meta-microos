SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mpich-hpc-devel-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "f12986e1f0eb827636e70fb3168570568b5660911c2d8a53f727c680257055962741aba6cf492b346e2d52d4317404625604a085f675b101e8d5f53c57ce61c5"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-mpich-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-mpich-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
mpich-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
