SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi2-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "a58b537c1f97c9ce1859bdafccc7a569d6d3e66cfcfa8d2a8a0f0b0711f30cb9856475288daaae2aa21f28e6f59bffde46ee4b38798abe8723cbb2e8cdfd2ca8"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
