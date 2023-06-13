SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-mpich-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "9f472a64b7079a61262aad612b96cdc0b986c722d6d1de232acdd7e4764c445fb930be68590ac31e79fc59a25f44d00dbd84a5417e4df1c159fb5d96706ba3ad"

RPROVIDES:${PN} += "libptscotch_6_1_0-gnu-mpich-hpc \
libptscotch_6_1_0-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit) \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
