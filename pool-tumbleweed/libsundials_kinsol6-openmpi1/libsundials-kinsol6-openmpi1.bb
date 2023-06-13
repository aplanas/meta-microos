SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "9cbad184e1c29dcde0657b6c62dee7ece9dc346fb13774c3c3fe2d4a94415a814bd49c45587e0b109fd50568933aa63641349ff014adcde7f58897e3b361fe93"

RPROVIDES:${PN} += "libsundials_kinsol.so.6()(64bit) \
libsundials_kinsol6-openmpi1 \
libsundials_kinsol6-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
