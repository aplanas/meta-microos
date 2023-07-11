SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "003401535ddf05ff4efa0fe13d65a1323afdf90d6c05fd0faaf64262db1c250c9d2f33dae84d34a46550a39f053c59ef0f27247259f5a149b155bb304a26ec5b"

RPROVIDES:${PN} += "libsundials-nvec6 \
libsundials-nvecmanyvector.so.6 \
libsundials-nvecpthreads.so.6 \
libsundials-nvecserial.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
