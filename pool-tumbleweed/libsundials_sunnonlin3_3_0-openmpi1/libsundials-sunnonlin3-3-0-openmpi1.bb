SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "35e31496134fd15f48698ccbbc44662d88ac1363d8f38a604014d855afae32c9d15087287220079a5843225c64f4cdc0b7a0cdd9d88dcc632220c29bf9e40735"

RPROVIDES:${PN} += "libsundials-sunnonlin3-3-0-openmpi1 \
libsundials-sunnonlinsolfixedpoint.so.3.3.0 \
libsundials-sunnonlinsolnewton.so.3.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
