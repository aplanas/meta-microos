SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "09796d2ca5225100ae879a87fcbf5cf293d6f031174fd48a9c8bc4aa3c9424df498ab248e8bdd65044be22f495add70f64ff18a213a6ab64d275656ca4d445e0"

RPROVIDES:${PN} += "libsundials_arkode.so.5()(64bit) \
libsundials_arkode5-openmpi1 \
libsundials_arkode5-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
