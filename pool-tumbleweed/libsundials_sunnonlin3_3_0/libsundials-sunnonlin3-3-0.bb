SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "a8c66daef765309f7ff1ce0e82e37502a5ad7c3d136a9423e59abc2e060f9d970ede227c54f6be820bf712f02ce521df5447af7a29cb7e95d88a82ab7531c4f6"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
