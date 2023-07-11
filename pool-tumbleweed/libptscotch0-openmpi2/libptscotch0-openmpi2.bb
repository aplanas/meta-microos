SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi2-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "ac3b074e0a1f7d9b21ab46629a566e4439d518efe7e4775aea9bbeb7c3c6b5b3cc357461332cfa3205d018ece683e72d67217c31065ce193c551427142da2765"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-openmpi2 \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.20 \
libscotch0 \
libz.so.1"

inherit rpm
