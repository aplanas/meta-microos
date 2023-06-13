SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi1 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi1-hpc-devel-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "3b401a7a555cc95dc1366568dc9040762da46ab8109a03555c7fa6548ee3b7db390ba77b6286a6ceaf4306095f490ed64fea8d001a58ad0720060b4455bd96b4"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi1-hpc-devel \
hypre_2_20_0-gnu-openmpi1-hpc-devel(aarch-64) \
pkgconfig(hypre)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libHYPRE_2_20_0-gnu-openmpi1-hpc \
libc.so.6()(64bit) \
libopenblas-gnu-hpc-devel \
openmpi1-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
