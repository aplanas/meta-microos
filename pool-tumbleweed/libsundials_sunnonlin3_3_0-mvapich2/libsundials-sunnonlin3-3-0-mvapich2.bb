SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "716b78afe908057df31acec2728d1d16ea60c56db18c517f47f69ea8a0c040e0270f2d052201b2ff086af5bd8d50b185758e3f95d58872c56f610aad5f672595"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-mvapich2 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
