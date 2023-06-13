SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mvapich2-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "c77be4b01b766d8c07ef746411b15839f619f254f25ddbe2ca452505f2c177489e1a18c8a1250a19b0b58aac3642a98e9f1b3689f92ade3b48a5eb84f30b234c"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-mvapich2-hpc \
ptscotch_6_1_0-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libptscotch_6_1_0-gnu-mvapich2-hpc \
libz.so.1()(64bit)"

inherit rpm
