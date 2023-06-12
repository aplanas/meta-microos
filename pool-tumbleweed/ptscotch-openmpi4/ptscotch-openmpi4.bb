SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi4-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "b9ea34c2aaa3c9122f8f2ed9cc0d719a71be780119808741bfacfcee172f1249ce76884739e814e0eb8cd899e1322519bd9f1ddd804294a892a0846a34988c18"

RPROVIDES:${PN} += "ptscotch-openmpi4 \
ptscotch-openmpi4(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.40()(64bit) \
libz.so.1()(64bit)"

inherit rpm
