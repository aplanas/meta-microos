SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "7c6c971716ce1efa0f154c43ad67613545a6667aad379be9e4d9872280cb78651866f5e4e54a84074542c310cf10c738c765ae6e26e35398c4d6c68ea899b5a1"

RPROVIDES:${PN} += "libsundials-sunmatrix4-openmpi4 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
