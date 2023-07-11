SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi2-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "7d876fdc47f3e916e160ac2c99bcaba9b332418679cdbf92880de2b2e2791acf3633f5b7a31a6bdb231d4246045e7ff03a64e51ec862cb7287ad91e058df8223"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi2-gnu-hpc \
libz.so.1 \
lua-lmod"

inherit rpm
