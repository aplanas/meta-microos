SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e18c5aa59f4063eb4a3fe5329ba0e7570dd1012899b6278279b0632fee6ccd0228126a024c634be65f92b05ab1764f731e2819272f129fe072cc275866ddb4a5"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-openmpi2 \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.20 \
libscotch0 \
libz.so.1"

inherit rpm
