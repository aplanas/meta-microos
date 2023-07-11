SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi3-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "657f390d4b3c676da7edca419a17366ec2efbc4980907a8b59752461bc17e2357bd4a633dedcb12b5eca22ab41df67d173fc085c03797d6507c1b0c419319ecb"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi3-gnu-hpc \
libz.so.1 \
lua-lmod"

inherit rpm
