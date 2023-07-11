SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "b77f8d406f00b8925db200303e66c55db0f86a9131cd920a7ba7b08dab7d8494e7238b05dc971842e0b409b649d70194131a1ea9244495646136edca1844342b"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-openmpi4 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
