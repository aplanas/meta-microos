SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "2b5e22649c7c43b224265fb93662f8c174e4866840098470e311db392e05a56be11da386dfd64492eb233f1ba07849761c2d1d195b3f623896f4ea11277cc21c"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
