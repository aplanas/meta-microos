SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "e370025f57e4e5ab1dc88c0c77d655d37bc4a8abdf9572f21853c31baec20cc7bde1b29c9fb7d058cbe6b8ba3d51b9cbee9160366e3927ba66e9df754ed0b919"

RPROVIDES:${PN} += "libsundials_sunlinsol4_3_0-openmpi2 \
libsundials_sunlinsol4_3_0-openmpi2(aarch-64) \
libsundials_sunlinsolband.so.4.3.0()(64bit) \
libsundials_sunlinsoldense.so.4.3.0()(64bit) \
libsundials_sunlinsolklu.so.4.3.0()(64bit) \
libsundials_sunlinsollapackband.so.4.3.0()(64bit) \
libsundials_sunlinsollapackdense.so.4.3.0()(64bit) \
libsundials_sunlinsolpcg.so.4.3.0()(64bit) \
libsundials_sunlinsolspbcgs.so.4.3.0()(64bit) \
libsundials_sunlinsolspfgmr.so.4.3.0()(64bit) \
libsundials_sunlinsolspgmr.so.4.3.0()(64bit) \
libsundials_sunlinsolsptfqmr.so.4.3.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libklu.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenblas.so.0()(64bit) \
libsundials_sunmatrix4-openmpi2 \
libsundials_sunmatrixband.so.4()(64bit) \
libsundials_sunmatrixdense.so.4()(64bit) \
libsundials_sunmatrixsparse.so.4()(64bit)"

inherit rpm
