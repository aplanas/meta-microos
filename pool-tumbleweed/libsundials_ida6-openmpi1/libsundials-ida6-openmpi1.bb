SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "95e8a977eb09e0787bfa480500e09defd7d77d2d80fcd0cc8fdbb19acc7475e1bc63f97ecdce8ffd1d5b28b448c1231c2e7420177a6898786a0351785531659f"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
