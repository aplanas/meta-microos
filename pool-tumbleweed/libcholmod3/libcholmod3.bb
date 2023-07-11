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

RPM_NAME = "libcholmod3-3.0.14-49.2.aarch64.rpm"
RPM_HASH = "963454f5cefcf14400ec824f16e13a86c48109e0a043d06829525d299bc999d76531fe4046ec8037cd73cf8449d13a9491efc5ae2284a9a2e587f5580002e816"

RPROVIDES:${PN} += "libcholmod-3-0-14 \
libcholmod.so.3 \
libcholmod3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libamd.so.2 \
libc.so.6 \
libcamd.so.2 \
libccolamd.so.2 \
libcolamd.so.2 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmetis.so.5 \
libopenblas.so.0 \
libsuitesparseconfig.so.5"

inherit rpm
