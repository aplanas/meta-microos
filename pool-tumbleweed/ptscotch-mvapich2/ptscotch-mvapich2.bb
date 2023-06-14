SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "f3ceaec3f11c109671eb8f534a794ccef657d3e22df3b000a305721d81d0a41a75a5139e03de31378db0def41b5681cb4697d67d00d3c96dc368af98671d7ff0"

RPROVIDES:${PN} += "ptscotch-mvapich2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
