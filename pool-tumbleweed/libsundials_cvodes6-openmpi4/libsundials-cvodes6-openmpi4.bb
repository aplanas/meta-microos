SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ad0c78d1041b5662dd466ef3f58ae35aa04024ddb0f4f40a249a09635327cdb03c9ead0a5fe5368d622379b69b7ff78b4349133d46401917080aefedc6c87a06"

RPROVIDES:${PN} += "libsundials_cvodes.so.6()(64bit) \
libsundials_cvodes6-openmpi4 \
libsundials_cvodes6-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
