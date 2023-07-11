SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-mvapich2-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "2e86e7b2b4239115421d13c7382d64a4111420c77615589d427fa2c9796b799d83fdd1969d3ffa8708b15a22a184537a7c55f5f6aabdb5f94729c26b0edb1a53"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libz.so.1 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
