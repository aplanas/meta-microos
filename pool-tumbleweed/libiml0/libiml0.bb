SUMMARY = "An Integer Matrix Library"
DESCRIPTION = "IML package provides routines to solve nonsingular systems of linear \
equations, solve any shape systems of linear equations, and perform \
mod p matrix operations, such as computing row-echelon form, \
determinant, rank profile, inverse of a mod p matrix."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "libiml0-1.0.5-5.11.aarch64.rpm"
RPM_HASH = "6cf69dffe2bcd22abea22dc367b3136ea499cec46724b0353bd63d72306df7bd71bf4b81da36f483332fd485d4e4f6be84f4545a68c14c524ff7fe49af5f35a6"

RPROVIDES:${PN} += "libiml.so.0()(64bit) \
libiml0 \
libiml0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopenblas.so.0()(64bit)"

inherit rpm
