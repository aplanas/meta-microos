SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-mvapich2-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "b7d3b239d0d8edfd0185f933e5cb0b0b56da8e061923486f969c7a7822d1b84ea7f5b2ad44b425807c96f126be23b58d4b6ae508e25337a996396d4f817e5003"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libz.so.1 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
