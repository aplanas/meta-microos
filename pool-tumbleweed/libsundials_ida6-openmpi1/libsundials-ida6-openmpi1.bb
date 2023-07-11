SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "5d64b286b92f462ad45b5be9c0fa5bc3681fc15efe92020d9b0e27f734a56dbdc278f703cac0230046da07859f99f6d981027611c420193de76f9d4cc24e90c9"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
