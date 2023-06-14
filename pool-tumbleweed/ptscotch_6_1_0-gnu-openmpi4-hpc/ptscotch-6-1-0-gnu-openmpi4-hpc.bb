SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi4-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "7f9f8261dfbfa50649e6ab8278f3cb2d3f0e8b04996be192f9ae45f875940526c0fe510efe5964efa1e8af5104a847a16f0b45358a8a3c690a27998d79b6b4bf"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi4-hpc \
libz.so.1"

inherit rpm
