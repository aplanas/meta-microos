SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ca80c746cdcc876937e2fe1a756cd2f18f13e997193cbef97cdd506e5d870cf7c75b7df1b691316e6f4445f7c3ea34c87ca93e31c5fc2e5bd304433f3873be04"

RPROVIDES:${PN} += "libsundials-sunlinsol4-3-0 \
libsundials-sunlinsolband.so.4.3.0 \
libsundials-sunlinsoldense.so.4.3.0 \
libsundials-sunlinsolklu.so.4.3.0 \
libsundials-sunlinsollapackband.so.4.3.0 \
libsundials-sunlinsollapackdense.so.4.3.0 \
libsundials-sunlinsolpcg.so.4.3.0 \
libsundials-sunlinsolspbcgs.so.4.3.0 \
libsundials-sunlinsolspfgmr.so.4.3.0 \
libsundials-sunlinsolspgmr.so.4.3.0 \
libsundials-sunlinsolsptfqmr.so.4.3.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libklu.so.1 \
libm.so.6 \
libopenblas.so.0 \
libsundials-sunmatrix4 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

inherit rpm
