SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "1a23a33d1c688ead5c01fa6ea0ee20bbfc70ea1c03507420899fea31d32cffe0218752366a3f1cd9afbf7a0ffde191c9b35b0f47e51479deb4f279cead93403c"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
