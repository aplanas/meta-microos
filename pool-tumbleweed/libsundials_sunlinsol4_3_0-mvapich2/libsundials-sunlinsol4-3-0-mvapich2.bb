SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "c634757dbe209e9a724064eefc5d56cb77675856135bdef3f89ab8be5ce54737315b38d29e0bf0a090e6acb8c06573edef17a07ba1870396b50936452439d001"

RPROVIDES:${PN} += "libsundials-sunlinsol4-3-0-mvapich2 \
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
libsundials-sunmatrix4-mvapich2 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

inherit rpm
