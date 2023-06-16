SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi1-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "a188097c713648fe31bbf9385ab5b987b6b16bfaaaa74eaa32045e553d80ef7c30deb07bd027b1394730f7894ac23461b2a2cbe90bb80a52fa46e39c151287fe"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi1-gnu-hpc \
libz.so.1 \
lua-lmod"

inherit rpm
