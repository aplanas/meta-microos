SUMMARY = "BLAS Shared Library"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra.  BLAS provides a number of basic algorithms for \
linear algebra."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libblas3-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "11d10673f6ed16bd8b915fffc7a0dcc9a5a1d60271ddbb9020215e3e2cbbbb526392eabcb189ed4979f043cc23f08e98caedf154f45fb5ebfa2731ff8ddf9246"

RPROVIDES:${PN} += "libblas.so.3()(64bit) \
libblas3 \
libblas3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
update-alternatives"

inherit rpm
