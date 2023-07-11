SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi3-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "cf9b9f218cda681d6ae49c9b62364dd51042136aed7b0f14a4531f0d9ad38238275ea1c5a97aa20fd6e407ea0506569612faf1ba59dc650c2b03e368b3fc8aaf"

RPROVIDES:${PN} += "ptscotch-openmpi3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libz.so.1"

inherit rpm
