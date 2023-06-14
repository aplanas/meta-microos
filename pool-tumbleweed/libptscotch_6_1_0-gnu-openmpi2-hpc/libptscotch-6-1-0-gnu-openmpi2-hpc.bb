SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi2-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "ae2d9fbddd24609b9428824954363fbc3b68cae3c48bb90f79da25b63de893587a43784aaad0132e86b0b0c4df9eb33eaa67e458af139948c7a03a42003e7027"

RPROVIDES:${PN} += "libptscotch-6-1-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi2-gnu-hpc \
libz.so.1 \
lua-lmod"

inherit rpm
