SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libscotch_6_1_0-gnu-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "e09a3fd2613eb81d78675807813ac3dc0f1859369f28f15d3aa626cf0938f7aa3d05254ca2d0a86b06e8beb55ebb99afc65d56813f21142329c1ff12477c076c"

RPROVIDES:${PN} += "libscotch-6-1-0-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libz.so.1 \
lua-lmod"

inherit rpm
