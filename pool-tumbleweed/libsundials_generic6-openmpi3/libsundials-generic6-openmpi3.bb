SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "eecd039f4e8d1c7efd07fb27dbc818dc1c76938755dd24c9f6e768524d11cfd36665fb0388d7744d49246af995071a31db56c87d69db87212f476095e28e235c"

RPROVIDES:${PN} += "libsundials_generic.so.6()(64bit) \
libsundials_generic6-openmpi3 \
libsundials_generic6-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
