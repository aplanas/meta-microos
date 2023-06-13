SUMMARY = "Multifrontal Sparse QR"
DESCRIPTION = "SuiteSparseQR is an implementation of the multifrontal sparse QR \
factorization method. Parallelism is exploited both in the BLAS and \
across different frontal matrices using Intel's Threading Building \
Blocks, a shared-memory programming model for modern multicore \
architectures. It can obtain a substantial fraction of the \
theoretical peak performance of a multicore computer. The package is \
written in C++ with user interfaces for MATLAB, C, and C++. \
 \
SuiteSparseQR is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "libspqr2-2.1.0-49.1.aarch64.rpm"
RPM_HASH = "2a8fabe30c0869f7300855420f35222da5ab05b16eb010fafcfb51db62a7ca04892c2b2409c5870f86f687f22cab1c826743295e99b7c3fbe1bdcca5ac44db19"

RPROVIDES:${PN} += "libspqr-2_1_0 \
libspqr.so.2()(64bit) \
libspqr2 \
libspqr2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcholmod.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopenblas.so.0()(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
