SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mpich-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "2b6aa5eccaad724c634420291d5f0f05e76ee970c1154db8cdd12a0a28d6b901894e2b672e753baf1795cb6e3babacbe526d42b285f1a362e8730325f73ea31f"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mpich-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-mpich-hpc \
libz.so.1"

inherit rpm
