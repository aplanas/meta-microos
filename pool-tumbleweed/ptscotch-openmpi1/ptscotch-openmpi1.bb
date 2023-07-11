SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi1-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "b7fb8a28a9e64c0b5fc2676ada2bc838f77d8428452ad3c3e745c4a8cf6023a3fffd720386a86cc4829e968c5139cdcf94841ec31b717992e6561144260a4771"

RPROVIDES:${PN} += "ptscotch-openmpi1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
