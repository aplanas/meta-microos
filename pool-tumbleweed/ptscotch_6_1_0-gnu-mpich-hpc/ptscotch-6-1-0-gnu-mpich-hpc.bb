SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mpich-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "6fa06ce10bd70edb67b027e6a60963b6d2301adeb5fbe958117e1c33d2f56e841d9a719b20ad489b585ec64c3d51bc812dd88f829c98c838e97e83e6b0b771f3"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-mpich-hpc \
ptscotch_6_1_0-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libptscotch_6_1_0-gnu-mpich-hpc \
libz.so.1()(64bit)"

inherit rpm
