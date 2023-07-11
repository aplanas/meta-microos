SUMMARY = "Column Approximate Minimum Degree"
DESCRIPTION = "The COLAMD column approximate minimum degree ordering algorithm \
computes a permutation vector P such that the LU factorization of \
A (:,P) tends to be sparser than that of A. The Cholesky \
factorization of (A (:,P))'*(A (:,P)) will also tend to be sparser \
than that of A'*A. SYMAMD is a symmetric minimum degree ordering \
method based on COLAMD, available as a MATLAB-callable function. It \
constructs a matrix M such that M'*M has the same pattern as A, and \
then uses COLAMD to compute a column ordering of M. Colamd and symamd \
tend to be faster and generate better orderings than their MATLAB \
counterparts, colmmd and symmmd. \
 \
COLAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.9.6"

RPM_NAME = "libcolamd2-2.9.6-49.2.aarch64.rpm"
RPM_HASH = "94e6fcf66c4ddcfd2ba73664c4237d7364a5d7a48e13e29a9d181e4d89bd4895330d84fe375c3bd92cb3af3df3eca9c36a32305c2d5333f0e84211796fc51c76"

RPROVIDES:${PN} += "libcolamd-2-9-6 \
libcolamd.so.2 \
libcolamd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
