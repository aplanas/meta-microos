SUMMARY = "Supernodal Sparse Cholesky Factorization and Update/Downdate"
DESCRIPTION = "CHOLMOD is a set of ANSI C routines for sparse Cholesky factorization \
and update/downdate. A MATLAB interface is provided. \
 \
The performance of CHOLMOD was compared with 10 other codes in a \
paper by Nick Gould, Yifan Hu, and Jennifer Scott. see also their raw \
data. Comparing BCSLIB-EXT, CHOLMOD, MA57, MUMPS, Oblio, PARDISO, \
SPOOLES, SPRSBLKLLT, TAUCS, UMFPACK, and WSMP, on 87 large symmetric \
positive definite matrices, they found CHOLMOD to be fastest for 42 \
of the 87 matrices. Its run time is either fastest or within 10% of \
the fastest for 73 out of 87 matrices. Considering just the larger \
matrices, it is either the fastest or within 10% of the fastest for \
40 out of 42 matrices. It uses the least amount of memory (or within \
10% of the least) for 35 of the 42 larger matrices. Jennifer Scott \
and Yifan Hu also discuss the design considerations for a sparse \
direct code. \
 \
CHOLMOD is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.14"

RPM_NAME = "libcholmod3-3.0.14-49.1.aarch64.rpm"
RPM_HASH = "f78f1259e83ec45cdac1828a4d1fed1bb471c55d647b0f0a3ba7cb530a8419bc1a4d8bb01b99f3ab9f8d6e0d670d605505f81c80fea1029dcde27a1a69e52fda"

RPROVIDES:${PN} += "libcholmod-3_0_14 \
libcholmod.so.3()(64bit) \
libcholmod3 \
libcholmod3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libamd.so.2()(64bit) \
libc.so.6()(64bit) \
libcamd.so.2()(64bit) \
libccolamd.so.2()(64bit) \
libcolamd.so.2()(64bit) \
libgomp.so.1()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmetis.so.5()(64bit) \
libopenblas.so.0()(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
