SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi1-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "16dcec3a54f1e02f65ac1a42e3aa26152dc6a119230ec57d1b3fe28148e464f3c235eb8d735ff8100af5bd27dc595dac89c16439270b80d5397709a6ce86a508"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi1-hpc \
libz.so.1"

inherit rpm
