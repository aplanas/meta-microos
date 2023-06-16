SUMMARY = "CBLAS Shared Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines available \
at www.netlib.org/blas to facilitate usage of BLAS functionality \
for C programmers."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libcblas3-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "cb048cbf0c5f05a2df00edc387d960e04294f4288f77a5a3fcdde12d066a3e0a8d306d5d8b041f14e691e131218dd7cdcb328d7d6bb1b946b5d6ed8629e5d30e"

RPROVIDES:${PN} += "libcblas.so.3 \
libcblas3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
update-alternatives"

inherit rpm
