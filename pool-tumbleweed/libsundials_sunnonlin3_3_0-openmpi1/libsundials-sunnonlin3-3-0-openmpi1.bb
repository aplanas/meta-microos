SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "e7790985cad00e0df9170ec9f16d297e182a7cf1e1d678420e02031def5630054a1012040088c66ee44b46d420b7c1fa2a71ab013dfd6493e89fa781e4a6a66d"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-openmpi1 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
