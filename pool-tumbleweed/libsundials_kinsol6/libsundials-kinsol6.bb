SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "e644a2452105b28af09b4c2890dc57e33b4afebacf0fcd0973bca72f85c9b638cc2b5d896a56a9b4fa802edbc34cd96263dcd761771049e64e777c6d0ca432ff"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
