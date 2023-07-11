SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "c548b569c90caa9e026c1dcdda652e143892e893945c4715f0ab3c31acb4c51c5918f44c333ec55e322a75824b420f48bd56e0b9c5f3ca3b6e0c0f8f0b9eb3fc"

RPROVIDES:${PN} += "libsundials-sunmatrix4 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
