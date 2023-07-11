SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi1-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "cf3824b4e5a5c52a1f61e0dab77bb8095bd716beca0d720fcb902e472eec9dffa83d1f4d2449cd6cd5ecd113ab9223b1424d63f8d7ae144ff16969667c7b587e"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi1-hpc \
libz.so.1"

inherit rpm
