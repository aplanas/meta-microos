SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "b11dc9637cd6ced05be7cb0917d73a49a55261fd64a6dddcfc7b6b5d813f8736662ba102787f5626884593790fdac9a9af994dcaa0b73f9145c3102a2936392f"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-openmpi4 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
