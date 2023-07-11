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

RPM_NAME = "libspqr2-2.1.0-49.2.aarch64.rpm"
RPM_HASH = "43dedbaed14582abbdd18fceb312c6222147a1840a317719a38cc17aacf8db4029f9616354a1613f8d3562d6e5d32ea42b6a4ef9abac7a16bb93d7c7150cddb2"

RPROVIDES:${PN} += "libspqr-2-1-0 \
libspqr.so.2 \
libspqr2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.3 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
libopenblas.so.0 \
libsuitesparseconfig.so.5"

inherit rpm
