SUMMARY = "SLIP LU, A Sparse Left-Looking Integer Preserving LU Factorization"
DESCRIPTION = "SLIP LU is software package used to solve a sparse systems of linear equations \
exactly using the Sparse Left-looking Integer-Preserving LU factorization. \
 \
SLIP LU solves a sparse system of linear equations using a given input \
matrix and right hand side vector file. This code can output the final \
solution to a user specified output file in either double precision or \
full precision rational numbers. If you intend to use SLIP LU within \
another program, refer to examples for help with this. \
 \
SLIP LU is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "libsliplu1-1.0.2-49.1.aarch64.rpm"
RPM_HASH = "06dd146117d8ff42847785f0f7d0054fd8a5610d63fd3a4ace7276e498c351fbd96a3233ab1ac89cf2f01cfd37a9ff55c1a478b57ac99da1173e59abcfa9a34c"

RPROVIDES:${PN} += "libsliplu-1-0-2 \
libsliplu.so.1 \
libsliplu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libamd.so.2 \
libc.so.6 \
libcolamd.so.2 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
