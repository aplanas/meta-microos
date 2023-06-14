SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "1553f67e6327bcdeca1df4f0f9c72ec10a9e642c5b61e2ffcd2705a94a6e211d85632f69d1192ee8f64956be74cedf697e543eff51d9f05299ed685944fc0c63"

RPROVIDES:${PN} += "libsundials-nvec6-mvapich2 \
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
libmpi.so.12"

inherit rpm
