SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi1-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e35d111401840064804c4d64fd8e63e3fa915af0ebaa3af80c162f60383d5e044b1bc57e46a7d132d5e6a97f10dcf66812973897b16fed6b2fb743426e4c26a6"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi1-gnu-hpc \
libz.so.1 \
lua-lmod"

inherit rpm
