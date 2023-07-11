SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "5eee7a6674e6ce5e23daf9dc13fdd6aae45d1bad8e4e1823654eae148adef864b9e54c51047926609177b126b96b2c58f90bf3ae2e8944e54412bb2e4a659058"

RPROVIDES:${PN} += "libsundials-sunmatrix4-openmpi1 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
