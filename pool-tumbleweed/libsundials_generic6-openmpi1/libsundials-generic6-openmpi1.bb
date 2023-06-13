SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "b032a8ee85d310d36837ce90afef89eb63ff93a266975c01b64bb457477bbcf0cb3ec407ed96ff72d8706393818f2e41ad763ea9b389f99d42ade5da4d45f8b1"

RPROVIDES:${PN} += "libsundials_generic.so.6()(64bit) \
libsundials_generic6-openmpi1 \
libsundials_generic6-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
