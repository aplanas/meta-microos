SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "9efb99eb602bb2356048b0562e8ceff29d8b3e5dfe68c9f92c7602626fdf1b43b9ee0770281f03b2f2b2e8883febc594845ab4496e6ae3ba7d7d6aa3db9e9fe9"

RPROVIDES:${PN} += "libsundials_idas.so.5()(64bit) \
libsundials_idas5-openmpi3 \
libsundials_idas5-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
