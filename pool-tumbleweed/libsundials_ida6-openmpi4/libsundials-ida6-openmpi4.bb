SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "f73044ffd23b276ec79738a20254e87cb68474a3bf9e0f02e488c5855d58aed52c71a7ab4010f91079b1008008d5c6278f059e99e702d131237ebb6977fa28f1"

RPROVIDES:${PN} += "libsundials_ida.so.6()(64bit) \
libsundials_ida6-openmpi4 \
libsundials_ida6-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
