SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "71a29f2a892deec64b6b682d67b3d53c9e1b42656d7b3917400a66559e439ad0f368cb81b29e10a178709d394a2187ca52935fc34a2a87d4310406360edfd6a4"

RPROVIDES:${PN} += "libsundials_kinsol.so.6()(64bit) \
libsundials_kinsol6-openmpi2 \
libsundials_kinsol6-openmpi2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
