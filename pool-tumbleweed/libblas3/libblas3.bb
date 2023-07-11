SUMMARY = "BLAS Shared Library"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra.  BLAS provides a number of basic algorithms for \
linear algebra."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libblas3-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "a01cc66dce96796941bb1632b01c7e3a84139c177e95033f286a20a5e9bebfe150860613947ff27a0c8c7fa42c6c5ad1dbf205e0cd2e84d9d69ebfb2ea39938e"

RPROVIDES:${PN} += "libblas.so.3 \
libblas3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
update-alternatives"

inherit rpm
