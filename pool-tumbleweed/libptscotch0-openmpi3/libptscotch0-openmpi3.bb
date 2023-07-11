SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi3-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "69552842559fefacbe976d9b0e0198759ef0aed23c777b9b0bf5ed444033cf8dfc8039a2f267b8fe90ba2fca2736a98bd8cec5350156e975e1e518fbd8fac957"

RPROVIDES:${PN} += "libptesmumps.so.0 \
libptscotch.so.0 \
libptscotch0-openmpi3 \
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
