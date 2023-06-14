SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi3-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "8494992992337b03aefc7bfa86504927a10e2ef07b52c9afec2c7af07b750ccedbdea7392a1d220954d2045b2b3feedb66db426d17c380bc352c32f5c5f44cd2"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-openmpi3 \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libscotch0 \
libz.so.1"

inherit rpm
