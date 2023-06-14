SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "31f1e20a58dc5adb3484da4591066813c9d34c8cacacafd4cba63441841fb9b6648e2da1fb93e4b807d37ca01be9634a460229458cd3a25b219e9f56dd662aa2"

RPROVIDES:${PN} += "libsundials-sunmatrix4-openmpi2 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
