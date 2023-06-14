SUMMARY = "Symmetric Approximate Minimum Degree"
DESCRIPTION = "CAMD is a set of routines for ordering a sparse matrix prior to \
Cholesky factorization (or for LU factorization with diagonal \
pivoting). There are versions in both C and Fortran. A MATLAB \
interface is provided. \
 \
CAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcamd2-2.4.6-49.1.aarch64.rpm"
RPM_HASH = "ad2c7b9393c220998257343c97b7471a118d42f5a6e748d22a7b148b68c0d358ed351e066de19b44c9174f6d47e67dcd42eedcef5fe9af37b4edfaa67701a875"

RPROVIDES:${PN} += "libcamd-2-4-6 \
libcamd.so.2 \
libcamd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
