SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ad2403d019e214af58380ec0a650c8d5bff4aa97669bf3eb7d72ff83b67c6769661f70d599e28b683f78b9db054af16038edc4f8bf25fe187ba08b346868e0c3"

RPROVIDES:${PN} += "libsundials_arkode.so.5()(64bit) \
libsundials_arkode5-openmpi4 \
libsundials_arkode5-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
