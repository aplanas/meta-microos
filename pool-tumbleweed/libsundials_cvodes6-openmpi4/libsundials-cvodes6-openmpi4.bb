SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "60717dc6950fedf4ad8294d5ae80f06637d024b018f05b760ea373d9190a8492a5ee82a1317170b2294fcdaa0397316bad1c7d959944c47d7b32df53eead99aa"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
