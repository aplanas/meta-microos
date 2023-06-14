SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "de07d915bc3e0a209e52c32cc441f7ea20fc89c42d0f9dc0cd39d0a3d57d2065f7761d91568e10a7fc986a1c11e106317d0b4801cbc60f00c5bf7fa071921b9a"

RPROVIDES:${PN} += "libsundials-sunmatrix4 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
