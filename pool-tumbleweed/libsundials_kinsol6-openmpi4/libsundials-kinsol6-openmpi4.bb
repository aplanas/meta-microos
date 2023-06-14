SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "fc73d43272ffaf9c0174fe5d579378d84e8dce04d0dcbb6c4980286659436de174e4a36df2628785186f7e97bf179cf7bd5e4a6d6d7a332c35ed1f882731b835"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
