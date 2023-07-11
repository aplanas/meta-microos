SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "cb10fb4ec3826966766ad6c03b4484bcd00fc0f2d5c243730cf5d9e56cf28cfeabe3967cbb30900efe372e6c1341c94c701e87fa3230af019c1d1e4ad38101b0"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
