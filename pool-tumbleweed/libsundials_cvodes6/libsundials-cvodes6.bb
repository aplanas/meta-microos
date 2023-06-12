SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "db1bd2256d9d650f17b791a159cf5399437b70e1cef14d66fcca8a4eca0f62032c05ae923afe57dc6934348af9623b707b249fc795a632eeaba4c22d9f961674"

RPROVIDES:${PN} += "libsundials_cvodes.so.6()(64bit) \
libsundials_cvodes6 \
libsundials_cvodes6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
