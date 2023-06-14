SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "2d5ceccc39dbd44fa60dd7f942ad55762e5c67e363c2d757e4c289bc488f6cfee3efd1bb9baa5c9d60ea38730c5906bda8a8d1b959fe0d2c3f89f197ad1553a0"

RPROVIDES:${PN} += "libsundials-nvec6-openmpi4 \
libsundials-nvecmanyvector.so.6 \
libsundials-nvecmpimanyvector.so.6 \
libsundials-nvecmpiplusx.so.6 \
libsundials-nvecparallel.so.6 \
libsundials-nvecpthreads.so.6 \
libsundials-nvecserial.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40"

inherit rpm
