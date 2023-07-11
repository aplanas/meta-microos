SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "23b7dd9e5a912a031785f55e82749c5f51f90c17d26bbaa93c7380809706cceb8006a8d0813248ac6ffa340d7c31c1b7236f4de8bf419a0eb811486af05d7f94"

RPROVIDES:${PN} += "libsundials-idas.so.5 \
libsundials-idas5-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
