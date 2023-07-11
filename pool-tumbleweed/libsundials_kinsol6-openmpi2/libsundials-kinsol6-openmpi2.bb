SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "06cef23f05c9a23cabf74afe61b2da211de0b58729405e3cd42d5a17d247ba8aef6ab1e18f381053927496e54a79dd5bfac4e6e2760f8ede75009608a0e066bb"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
