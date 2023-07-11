SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "39bc3338d4b93cfa058b98e29b50e5301119bb28e876052f2b26a1f6a2be6a9c4d1fe86f75d0252c734d4e9feb2f9b5e1850afb60f47d694b50475cce7846303"

RPROVIDES:${PN} += "libsundials-idas.so.5 \
libsundials-idas5-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
