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

RPM_NAME = "libgraphblas7-7.2.0-49.2.aarch64.rpm"
RPM_HASH = "e9f6baa0515ee83925015b60c9e91a041abe1983d94a13d16efb783403b82783a52919e83007383b6a36592f93a0cce9bcef315ab3785608f794ca729561e08e"

RPROVIDES:${PN} += "libgraphblas-7-2-0 \
libgraphblas.so.7 \
libgraphblas7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
