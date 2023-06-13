SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "66abdb7af3cc7b75c909dd72cbb1fcfbdc2fa27073356780356f9134895193c49641ff4150073cc67923744cfcccaf9bb042bebd04a0890c73185626bdea2338"

RPROVIDES:${PN} += "ptscotch-openmpi2 \
ptscotch-openmpi2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libmpi.so.20()(64bit) \
libz.so.1()(64bit)"

inherit rpm
