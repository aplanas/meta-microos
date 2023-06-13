SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mpich-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "c6677f2e970345dc48626624c07baa9f8f8ee56c0e344c243f409143f55e3f5c803d130fa9afb8654fb7ddd107cdc331f3578f6b0ef9e1888ee06ab57d63c628"

RPROVIDES:${PN} += "ptscotch-mpich \
ptscotch-mpich(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libz.so.1()(64bit)"

inherit rpm
