SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ccc6f43b4a4a30347da7d8e756fcb26488f320aec0a3d3c1eeb15b3500d69eb56b59142a63f9c25241faf15b71af50eb2b1aaa0e083be373613d90bfccc5be1b"

RPROVIDES:${PN} += "libsundials_nvec6-openmpi2 \
libsundials_nvec6-openmpi2(aarch-64) \
libsundials_nvecmanyvector.so.6()(64bit) \
libsundials_nvecmpimanyvector.so.6()(64bit) \
libsundials_nvecmpiplusx.so.6()(64bit) \
libsundials_nvecparallel.so.6()(64bit) \
libsundials_nvecpthreads.so.6()(64bit) \
libsundials_nvecserial.so.6()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.20()(64bit)"

inherit rpm
