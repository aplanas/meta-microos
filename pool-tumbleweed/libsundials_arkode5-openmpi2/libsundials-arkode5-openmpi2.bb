SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "c5104956188ec8e068f184eec0d572dce7af6b16307678ec4461ee3b4505db390446eb58bae4a677c12fa0a99bc18d9dcc46dbb2ef9bda5cdacf5f8f7aaff799"

RPROVIDES:${PN} += "libsundials_arkode.so.5()(64bit) \
libsundials_arkode5-openmpi2 \
libsundials_arkode5-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
