SUMMARY = "Sparse Multifrontal LU Factorization"
DESCRIPTION = "UMFPACK is a set of routines for solving unsymmetric sparse linear \
systems, Ax=b, using the Unsymmetric MultiFrontal method. Written in \
ANSI/ISO C, with a MATLAB (Version 6.0 and later) interface. Appears \
as a built-in routine (for lu, backslash, and forward slash) in M \
ATLAB. Includes a MATLAB interface, a C-callable interface, and a \
Fortran-callable interface. Note that 'UMFPACK' is pronounced in two \
syllables, 'Umph Pack'. It is not 'You Em Ef Pack'. \
 \
UMFPACK is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "5.7.9"

RPM_NAME = "libumfpack5-5.7.9-49.2.aarch64.rpm"
RPM_HASH = "75fecdbe08ad781ab8a35d68bc6ef5f43dc3fb19e4e30f0b99d89354b6b4e7ce8eaa95de0b8dbdbfcccee1d9fc7d4d6b7fe62f3aa8925e877f5b186002a41cd2"

RPROVIDES:${PN} += "libumfpack-5-7-9 \
libumfpack.so.5 \
libumfpack5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libamd.so.2 \
libc.so.6 \
libcholmod.so.3 \
libm.so.6 \
libopenblas.so.0 \
libsuitesparseconfig.so.5"

inherit rpm
