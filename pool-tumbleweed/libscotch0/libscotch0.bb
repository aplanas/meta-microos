SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libscotch0-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "63e92ecaf67952bfbbcbcacbd237684036d6a9f1ba71be45bc6d1e404cd01b3662442ed3eb79585d1d322d46635e303f1bc4e3e272db72735d4b6c8646cb2aea"

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
