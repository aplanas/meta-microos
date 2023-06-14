SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "6ad6aeec477ccab5047868834bb88f9ae6ac3b6f1d0980858e637f077093a3cbeb9a142fb47410c18abe7f5957f02086419c48b542da057dfbc4d8bf2cfc7589"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
