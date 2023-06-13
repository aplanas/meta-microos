SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi3 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi3-hpc-devel-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "04f486d62e814451960aa76b0f7c3e6706a6ee06b1b981c6e96c32ef8a1506410d9e968b50ea62154f1e8c4958e1f15f5b8c3e237aa0f71b949786815ba2a9e0"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi3-hpc-devel \
hypre_2_20_0-gnu-openmpi3-hpc-devel(aarch-64) \
pkgconfig(hypre)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libHYPRE_2_20_0-gnu-openmpi3-hpc \
libc.so.6()(64bit) \
libopenblas-gnu-hpc-devel \
openmpi3-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
