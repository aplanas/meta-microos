SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi4-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "aed81a7f0023167a459c11dfdaec8503898cafa4aca77fbff8750f87ed54c410e1f3e7add276bed3328c0d90b65325f40789f0932ca630468d5e9a0f2368f09a"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi4-gnu-hpc \
libz.so.1 \
lua-lmod"

inherit rpm
