SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mpich-hpc-devel-2.20.0-1.25.aarch64.rpm"
RPM_HASH = "2d2dae8388e7cd1a41c2f20adf5ef98ec9956731ba2367b4c80a38e31e211fe43dc331f3076ac88853818ca5375d676a3820368955fd9fef5c2445cf17540bac"

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
