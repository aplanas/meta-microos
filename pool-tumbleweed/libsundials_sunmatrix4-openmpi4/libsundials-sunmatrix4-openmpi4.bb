SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "c026a61282ca88054b50ab5c7bca10bc1fee098cea0470b1b89427183ab6b1349fd75aefe6de0e308280dbee485342a37f2b18256b847a9f1a07ec52f9932c41"

RPROVIDES:${PN} += "libsundials_sunmatrix4-openmpi4 \
libsundials_sunmatrix4-openmpi4(aarch-64) \
libsundials_sunmatrixband.so.4()(64bit) \
libsundials_sunmatrixdense.so.4()(64bit) \
libsundials_sunmatrixsparse.so.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
