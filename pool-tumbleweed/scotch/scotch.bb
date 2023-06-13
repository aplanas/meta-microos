SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "b74116809db62a6bc164bf9dacb8661863274cdded4abb6c1f83e580bfc898eff9830fbb4a6caa7144ba19e2e5b83341d5b20b09fc8da34fa50652e682c63c33"

RPROVIDES:${PN} += "scotch \
scotch(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
