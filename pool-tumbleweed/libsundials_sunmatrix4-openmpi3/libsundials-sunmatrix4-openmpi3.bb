SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "7f3f4b5c7e583b550ae58226f0b639420ffc1b0ea04e760ad33a86d910705cb51a72506f6f60de972f20db1ef96189dfdd11cc094c4bbfea4b3726d8224b3c6b"

RPROVIDES:${PN} += "libsundials-sunmatrix4-openmpi3 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
