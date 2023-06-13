SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi2-hpc-devel-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "8625bd7b428fc63023d6827d8dae14b2db007cd22f54fdf40e405119d4189d17320ae68379611635c2c1d3e6d8bd390b959d23ceac2b09b92cacfbef5d4c5d24"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi2-hpc-devel \
hypre_2_20_0-gnu-openmpi2-hpc-devel(aarch-64) \
pkgconfig(hypre)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHYPRE_2_20_0-gnu-openmpi2-hpc \
libc.so.6(GLIBC_2.17)(64bit) \
libopenblas-gnu-hpc-devel \
openmpi2-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
