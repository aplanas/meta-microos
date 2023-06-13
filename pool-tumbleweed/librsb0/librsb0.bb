SUMMARY = "Shared memory parallel sparse matrix and sparse BLAS library"
DESCRIPTION = "librsb is a library for sparse matrix computations featuring the \
Recursive Sparse Blocks (RSB) matrix format. This format allows cache \
efficient and multi-threaded (that is, shared memory parallel) \
operations on large sparse matrices. \
 \
librsb implements the Sparse BLAS standard, as specified in the BLAS \
Forum documents."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.0.1"

RPM_NAME = "librsb0-1.3.0.1-1.5.aarch64.rpm"
RPM_HASH = "6532debc39b889ebe45ccad4b56a06f9368c5b6bf2151d7847927924cc121f25f165b5032a8c03baf045bdb80788f557246ea29ab8ace19d00370aa5f0d5fde4"

RPROVIDES:${PN} += "librsb.so.0()(64bit) \
librsb0 \
librsb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
