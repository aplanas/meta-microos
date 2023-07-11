SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi2-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a3b9401bce206dfe0fb676a460071c20fcb85a647d61fccefcce0dde8e5bbc7cc43f57476b54efd7da9e478b744b48dcbaebb62b8451877fc53111adf092054d"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi2-hpc \
libz.so.1"

inherit rpm
