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

RPM_NAME = "librsb0-1.3.0.1-1.6.aarch64.rpm"
RPM_HASH = "fa6bceecd6cb6fa1b69dd613d1b9748d48a0ca6e33854ea1165c180b042020c2b90a066a59bb5a9046d6ef3ab695e9799fc4787488bcc4971ed25c30ab7f7a74"

RPROVIDES:${PN} += "librsb.so.0 \
librsb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
