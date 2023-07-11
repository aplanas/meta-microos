SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi4-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a68b4e984e39a9245dbf086c88f3d81b78b14ea12a6bd1411f26e460d93e482586ef9aa140746f18f16f7052c8a43901446af7346394ba2c5f12e7e5cd5f9d40"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi4-hpc \
libz.so.1"

inherit rpm
