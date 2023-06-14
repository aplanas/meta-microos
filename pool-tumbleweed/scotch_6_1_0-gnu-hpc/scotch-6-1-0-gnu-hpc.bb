SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch_6_1_0-gnu-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "32eee9f6b257fa5ed64b0be61742031470eb640dd63f8e7b86a33d2d5708e7a0a78f9763815820673173b6d6be1fac2878685ae1d07d0917bafa940db9fb474e"

RPROVIDES:${PN} += "scotch-6-1-0-gnu-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libscotch-6-1-0-gnu-hpc \
libz.so.1"

inherit rpm
