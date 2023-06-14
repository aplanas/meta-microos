SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-mpich-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "22b7bd8a62505e316ed7948719eba2c1e2aefcde942fe2543a80e5f03997cc52b5963a5604e612416cbda6aecea3678087c32828ff0a279cf593e56a979916d3"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-mpich \
libptscotcherr.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscotch0 \
libz.so.1"

inherit rpm
