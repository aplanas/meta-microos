SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "7adf40a7b371ed243ad48ebafd317a6ec36bc762124b013c90f3a73c2e9c0f49a4c7d5ff0a1cba9a7b437c29eaaf75001bb0fc65230d284dea2c4340451dcfb6"

RPROVIDES:${PN} += "ptscotch-mvapich2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
