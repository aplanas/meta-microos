SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi1-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "d6cffc47c512fa27319f5271e03cb03ea7bef28b02b2dbccbb10206a572ab617ff4be9a1578a7bdb712d86d2f658808619e2d51783038f84e13b90fa2c5c9209"

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
