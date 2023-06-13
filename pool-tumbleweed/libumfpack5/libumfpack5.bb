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

RPM_NAME = "libumfpack5-5.7.9-49.1.aarch64.rpm"
RPM_HASH = "e7866e710a1f9bfe008bfa908d27d222d915e53c8d1e5d2645cfcded7031e052859f78c9e1afd416aadc7dd851a201378841c717c271c02fa6f31744c9fc325d"

RPROVIDES:${PN} += "libumfpack-5_7_9 \
libumfpack.so.5()(64bit) \
libumfpack5 \
libumfpack5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libamd.so.2()(64bit) \
libc.so.6()(64bit) \
libcholmod.so.3()(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
