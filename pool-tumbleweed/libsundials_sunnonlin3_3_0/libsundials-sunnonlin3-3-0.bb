SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "e13e1bc76ed97fce26b7801715c515cae11ca7b0c4b786b29825aec10be23fad7e7d7b045e243c1282924a7fb8ce84b84a58306c974744bdc2b9663dedef2902"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
