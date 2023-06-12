SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi1-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "c41a53a19135f150de5b6b9f7cd46db365685752fa7296985c017dba8b2305c9985ba190d2b4009517e36d56f5cdf0b65040557cc9b7db9f83ea298f72a2b02c"

RPROVIDES:${PN} += "ptscotch-openmpi1 \
ptscotch-openmpi1(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.12()(64bit) \
libz.so.1()(64bit)"

inherit rpm
