SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "7c1fe5fa9c0d83b6803b9c9d66dfa894b7b73db3e117d1bac433a7500e17f250eeacd1349e26a15d730ae754c7a04a6503238a3046722939493b914e35afe4f1"

RPROVIDES:${PN} += "libsundials-sunmatrix4-openmpi2 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
