SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi4-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "350fefae634e7bc47248bfc9f289df184d6c717204de069f133c0a37239efd3c659e954ff7fb35f71b9c38f903cdce6c7d24e975ba045951966ced80ddce9b65"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-openmpi4 \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40 \
libscotch0 \
libz.so.1"

inherit rpm
