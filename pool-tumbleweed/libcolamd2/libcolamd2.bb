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

RPM_NAME = "libcolamd2-2.9.6-49.1.aarch64.rpm"
RPM_HASH = "821586c8865d37bb1002cea42e1d7ddc343ecbc996e593c74ea47bb53be3197884c400b0a987d2b3a68fd430833ae9acf1c214c167b9a3dfbc80996a0f9b9982"

RPROVIDES:${PN} += "libcolamd-2_9_6 \
libcolamd.so.2()(64bit) \
libcolamd2 \
libcolamd2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
