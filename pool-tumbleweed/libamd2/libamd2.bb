SUMMARY = "Symmetric Approximate Minimum Degree"
DESCRIPTION = "AMD is a set of routines for ordering a sparse matrix prior to \
Cholesky factorization (or for LU factorization with diagonal \
pivoting). There are versions in both C and Fortran. A MATLAB \
interface is provided. \
 \
Note that this software has nothing to do with AMD the company. \
 \
AMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libamd2-2.4.6-49.2.aarch64.rpm"
RPM_HASH = "622410c1f8a04cc6652114cf094b60d5ac1542853dab53ab2274d9d88c4ad9a8966192e81c7b54c15c726a62d1418d34f2bc82ef3c20eb8c7216e5a76b24bf81"

RPROVIDES:${PN} += "libamd-2-4-6 \
libamd.so.2 \
libamd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
