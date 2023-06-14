SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ccc6f43b4a4a30347da7d8e756fcb26488f320aec0a3d3c1eeb15b3500d69eb56b59142a63f9c25241faf15b71af50eb2b1aaa0e083be373613d90bfccc5be1b"

RPROVIDES:${PN} += "libsundials-nvec6-openmpi2 \
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
libmpi.so.20"

inherit rpm
