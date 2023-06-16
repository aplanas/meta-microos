SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libscotch_6_1_0-gnu-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "10f7163732465e01fecc5d6334313ddbea608a8b5ae138cf6a5191fef97f354f80c37ab577fc64f3c1e2570b9bee963c6a2e28e3b86899ea6820f27c9bc297c1"

RPROVIDES:${PN} += "libscotch-6-1-0-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libz.so.1 \
lua-lmod"

inherit rpm
