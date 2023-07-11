SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi3-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "889f9d93a2081931fdfcee9149c8d9e9e9c9edfe02eb0db4f1c5776394f4cd454df8191694ebe27a920cb415334b31b4b87b9fd783d27f8f1cfa5311fe246b4b"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi3-hpc \
libz.so.1"

inherit rpm
