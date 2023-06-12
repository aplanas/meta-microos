SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-openmpi4-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "c0dca1b5da9d1e339ab1ca1abdfa6a953baa88c946b2985adf9cba57726d7907c705caadb24b4019977efecda9f139631e04f3ddbb59d138f58b4d450997e836"

RPROVIDES:${PN} += "libsundials_sunlinsol4_3_0-openmpi4 \
libsundials_sunlinsol4_3_0-openmpi4(aarch-64) \
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
libsundials_sunmatrix4-openmpi4 \
libsundials_sunmatrixband.so.4()(64bit) \
libsundials_sunmatrixdense.so.4()(64bit) \
libsundials_sunmatrixsparse.so.4()(64bit)"

inherit rpm
