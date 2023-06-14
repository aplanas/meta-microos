SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi2-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "88ed0d39d56d44e3ebb77f7097764d150285627c6b89e26d3d5641feaee8fb21dc807bb7fc8cd9745a7d9935c9a8d44eb2ed642574d438f316764302c8e66fbb"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi2-hpc \
libz.so.1"

inherit rpm
