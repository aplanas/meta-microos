SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "4b2e0d4649d45dde03f5f5ab3eaf6c72ba9317d06ea1686bf3f2f2a61631f4f8ab95ee2752ecb24f47cb18b25071ebd99b78c9382d34b0740df16cc7ceaf444e"

RPROVIDES:${PN} += "libsundials_kinsol.so.6()(64bit) \
libsundials_kinsol6-openmpi3 \
libsundials_kinsol6-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
