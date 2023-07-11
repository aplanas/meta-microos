SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "be244b44d539dd15b1f82a685333d87cefc5c19865164c08d4787176464af3f07bc705dc2c46e08363192ba55dc5ff07e7cf4fe253bd9df64f3b69fa97b1678d"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
