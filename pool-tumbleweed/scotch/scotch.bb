SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "d19a1c319825d799b6ef18d7ac7e6f6817c0002258f0cb0a5714560107e7c2135e6f6fff038bed405113b56b08a46c2825968e307ceeaf79d0dc88392529f6bb"

RPROVIDES:${PN} += "scotch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
