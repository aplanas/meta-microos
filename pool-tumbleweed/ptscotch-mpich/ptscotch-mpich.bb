SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mpich-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "893d69913a2e96c3c3c32f37a6f7cc1a402da906015ad648828e7dfdb05b6b00b0d55e9990f28c2256f284064107cea4c0618609fdd3602d5bc04366a977feb5"

RPROVIDES:${PN} += "ptscotch-mpich"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
