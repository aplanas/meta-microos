SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "3fa3428495fc5aa98e7d1bcf711d290b8a77c28beaa4376a627f14b3e5c0f8ce30254d9f2958e4795b1d2498c31cd8a7a0d302e8416f521b50be291b48a8e24e"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-openmpi2 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
