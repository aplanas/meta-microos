SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi4-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "1933012afc881709a1284541e6126dd52ecb191197b91169caabf3b9307217a6b78d48fcf44a7622907b08f748d8206bf30b521f8149dcd5735f1bafe8e72535"

RPROVIDES:${PN} += "ptscotch-openmpi4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libz.so.1"

inherit rpm
