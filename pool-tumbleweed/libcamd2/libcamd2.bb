SUMMARY = "Symmetric Approximate Minimum Degree"
DESCRIPTION = "CAMD is a set of routines for ordering a sparse matrix prior to \
Cholesky factorization (or for LU factorization with diagonal \
pivoting). There are versions in both C and Fortran. A MATLAB \
interface is provided. \
 \
CAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcamd2-2.4.6-49.2.aarch64.rpm"
RPM_HASH = "f9a437d212379da4f6e63621070aca74d719f1d96c00060d06b873b64d3467bddeffe72bc4526642ccfd83913a2f38aa5d27c66f9825d9c0cf6d2ee68ca11ae0"

RPROVIDES:${PN} += "libcamd-2-4-6 \
libcamd.so.2 \
libcamd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
