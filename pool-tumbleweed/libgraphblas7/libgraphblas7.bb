SUMMARY = "An implementation of the GraphBLAS standard"
DESCRIPTION = "GraphBLAS is an full implementation of the GraphBLAS standard, \
which defines a set of sparse matrix operations on an extended algebra of \
semirings using an almost unlimited variety of operators and types.  When \
applied to sparse adjacency matrices, these algebraic operations are equivalent \
to computations on graphs.  GraphBLAS provides a powerful and expressive \
framework for creating graph algorithms based on the elegant mathematics of \
sparse matrix operations on a semiring. \
 \
GraphBLAS is part of the SuiteSparse sparse matrix suite."
LICENSE = "Apache-2.0"

PV = "7.2.0"

RPM_NAME = "libgraphblas7-7.2.0-49.1.aarch64.rpm"
RPM_HASH = "42a5d02aa801e60ffc81e19fa09995d63c8bda2e58e0e9e7ae8ad37218c6cce9f0f8255e66d8b19840e9352b3495c9b74c96f8b55cd481353b16a72ba9733493"

RPROVIDES:${PN} += "libgraphblas-7_2_0 \
libgraphblas.so.7()(64bit) \
libgraphblas7 \
libgraphblas7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
