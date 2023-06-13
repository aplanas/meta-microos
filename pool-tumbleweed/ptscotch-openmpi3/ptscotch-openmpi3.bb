SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi3-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "a2133fd12e2943e8a06286a3e97fd9fc84f9391ff60b4716a75a374b6e3d5870cd0ead72db079a0b7b54c242259b6240795539f890e19985d7e6de668bf334a8"

RPROVIDES:${PN} += "ptscotch-openmpi3 \
ptscotch-openmpi3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpi.so.40()(64bit) \
libz.so.1()(64bit)"

inherit rpm
