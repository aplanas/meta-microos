SUMMARY = "Development files for librsb, a Recursive Sparse Blocks matrix format lirary"
DESCRIPTION = "librsb is a library for sparse matrix computations featuring the \
Recursive Sparse Blocks (RSB) matrix format. This format allows cache \
efficient and multi-threaded (that is, shared memory parallel) \
operations on large sparse matrices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librsb."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.0.1"

RPM_NAME = "librsb-devel-1.3.0.1-1.6.aarch64.rpm"
RPM_HASH = "51bb3cc6f120f05b17afa8c69dfdb2c976434e0570094818e538783428a5b45db326b19e5458f90a99efa5d2c9c5a47b1631dab55d466e01493afa7fe266c21f"

RPROVIDES:${PN} += "librsb-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
librsb.so.0 \
librsb0 \
libstdc++.so.6"

inherit rpm
