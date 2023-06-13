SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "f3ceaec3f11c109671eb8f534a794ccef657d3e22df3b000a305721d81d0a41a75a5139e03de31378db0def41b5681cb4697d67d00d3c96dc368af98671d7ff0"

RPROVIDES:${PN} += "ptscotch-mvapich2 \
ptscotch-mvapich2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.12()(64bit) \
libz.so.1()(64bit)"

inherit rpm
