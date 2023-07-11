SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "63ad90096f0cd13653910133e2e026b4eecfb99dd536642f71d74279578b6ec9f9392de5486eb34d5c6e2d62a1a777adc7f949d75af40935eec230cd3c24d442"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-openmpi3 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
