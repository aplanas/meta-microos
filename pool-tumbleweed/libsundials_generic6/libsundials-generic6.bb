SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "c8c255754e3b9573ed72d1427a36ce8d69934e83a0aa144a9e9ad9d722942d565acefd4c90572e152ca63d07210e1e76b0fd9145f1ef961155dd8633da2005e4"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
