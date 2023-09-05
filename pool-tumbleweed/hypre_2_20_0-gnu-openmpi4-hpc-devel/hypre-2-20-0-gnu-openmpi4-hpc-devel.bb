SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi4-hpc-devel-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "56e36912817356fb217983af48fd7a60c008642c6354f4acda72201521636029838b6a3e1389c5c156080f4c842f4ff59f2e8beb12c2fe2dc3cdfce4a99cb093"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi4-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi4-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi4-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
