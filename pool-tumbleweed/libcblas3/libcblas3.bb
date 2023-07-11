SUMMARY = "CBLAS Shared Library"
DESCRIPTION = "This library provides a native C interface to BLAS routines available \
at www.netlib.org/blas to facilitate usage of BLAS functionality \
for C programmers."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libcblas3-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "fba76daf5f451a4e40c99af0225da8a6ad135ef952fd3b307027103d1735caeb6b55ee840d78c0921e07e3a9458a7d0c14589ad5d2bb06f8214f7e58a5cf1874"

RPROVIDES:${PN} += "libcblas.so.3 \
libcblas3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
update-alternatives"

inherit rpm
