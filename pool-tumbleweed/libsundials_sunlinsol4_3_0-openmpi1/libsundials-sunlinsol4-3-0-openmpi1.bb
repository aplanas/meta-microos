SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "64ec5cf5b0284e109cf1d843e09e2907faa3bd0d4dafc289d96bfd92ccad4d4f718072320fdb15e13c52f9f8d7d2c636132809f2697d7c70fe47a07f1210ff7e"

RPROVIDES:${PN} += "libsundials-sunlinsol4-3-0-openmpi1 \
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
libsundials-sunmatrix4-openmpi1 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

inherit rpm
