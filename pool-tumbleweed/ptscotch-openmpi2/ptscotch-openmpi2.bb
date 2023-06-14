SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "66abdb7af3cc7b75c909dd72cbb1fcfbdc2fa27073356780356f9134895193c49641ff4150073cc67923744cfcccaf9bb042bebd04a0890c73185626bdea2338"

RPROVIDES:${PN} += "ptscotch-openmpi2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.20 \
libz.so.1"

inherit rpm
