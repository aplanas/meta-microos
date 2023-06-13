SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "a32c061e2bdc610032182cef4b8a8e6eb522140d4a67540465c78163e35629c9211f83097e9ffc173314bc206bed19cc8b05d6343ea3fca12631b8398fb03a74"

RPROVIDES:${PN} += "libsundials_cvode.so.6()(64bit) \
libsundials_cvode6-openmpi4 \
libsundials_cvode6-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
