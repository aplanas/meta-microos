SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi1-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "03b6b17480ffa0ceeba312541b7a9d3588661e62360a105e99f6d2ec3ad22425ed1d31ff4bbc51cbc99aa5ba5f528f9633bfd4bfed2a139d67ffba08e91e9405"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-openmpi1 \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscotch0 \
libz.so.1"

inherit rpm
