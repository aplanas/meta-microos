SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "fb3d72a4792cac3a366670323eba94217204f591bc274910b44142e647472c523968b5dd23596b43c173b68e73cb9e3df18e0c4e6a685fb62db84ac4ed10e02e"

RPROVIDES:${PN} += "libsundials-sunmatrix4-mvapich2 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
