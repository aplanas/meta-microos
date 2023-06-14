SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libscotch0-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a1a913dae6bb4300e6068b295c9fb6b068d8fb378c333a3701c4c29c394aaa15c973e8f817b4f537e23041c2a3a04e9eaaf03a9db26770764691b28708822294"

RPROVIDES:${PN} += "libesmumps.so.0 \
libscotch.so.0 \
libscotch0 \
libscotcherr.so.0 \
libscotcherrexit.so.0 \
libscotchmetis.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
