SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-mpich-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "fdca991c787e6d3990ff8dda11977e7bc0d156d07c7e5019157a05c00dc8cd62494768d1df94bf9d996f2c9b365ee89aa549e85bc22bef2f21d02638c99ff499"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libz.so.1 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
