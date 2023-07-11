SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "2863d1624c6a0f57a337252d07c112a6248eebb6330b41b95193e5b05249e701635ae09d9f6dfeebe34816e3cc7a4cb85a306da8f2f461179676a7ad65244027"

RPROVIDES:${PN} += "ptscotch-openmpi2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.20 \
libz.so.1"

inherit rpm
