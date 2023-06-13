SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "73d7d55693d96528a1a523c23a761f99b6233583c7bc8968394ffdfceca68c84f51a409d5fb9161fc6562ab0876b3eabf156968e97b08a3548293aba0ad59a27"

RPROVIDES:${PN} += "libsundials_cvodes.so.6()(64bit) \
libsundials_cvodes6-openmpi1 \
libsundials_cvodes6-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
