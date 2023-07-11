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

RPM_NAME = "libsliplu1-1.0.2-49.2.aarch64.rpm"
RPM_HASH = "44ae0c333c6502f2fe9718df5e6e1e5bc850409e7f501eee1ef402deb0d25fa0b99c2912171ad268ea0a57e162a03461b8bbcc77c69d38d90c484c6a8d7633b1"

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
