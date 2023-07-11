SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch_6_1_0-gnu-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "b17d356830713ea3188300c61b2d44898f01e20af85cf3707a8e22dbe8a2b83021c7d9190831dd2da67af0c17e745f0c89e1c92dd3a96bb26b112f49fe03291e"

RPROVIDES:${PN} += "scotch-6-1-0-gnu-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libscotch-6-1-0-gnu-hpc \
libz.so.1"

inherit rpm
