SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "f9ed22becd9663cf1338dcf85754b5eace84b8c1fb6d4982761d4a9e4c4f3ecc4fd97ad1b46d36226441d1940034c6e53825cefd1fea1972776d65b655dfdbc0"

RPROVIDES:${PN} += "libsundials_cvode.so.6()(64bit) \
libsundials_cvode6-openmpi3 \
libsundials_cvode6-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
