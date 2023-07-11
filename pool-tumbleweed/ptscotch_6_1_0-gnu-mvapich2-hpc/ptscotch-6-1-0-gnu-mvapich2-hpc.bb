SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mvapich2-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "649aecd15b4a8c8234cddfd592e2ef6901192a2de1f0af936c06d490e0372c050b5b91bd069a87cf6d3647c85c6f6a85e443ce511883cc098ba46ea198d77d93"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-mvapich2-hpc \
libz.so.1"

inherit rpm
