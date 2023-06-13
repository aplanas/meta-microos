SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "c634757dbe209e9a724064eefc5d56cb77675856135bdef3f89ab8be5ce54737315b38d29e0bf0a090e6acb8c06573edef17a07ba1870396b50936452439d001"

RPROVIDES:${PN} += "libsundials_sunlinsol4_3_0-mvapich2 \
libsundials_sunlinsol4_3_0-mvapich2(aarch-64) \
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
libc.so.6()(64bit) \
libklu.so.1()(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libsundials_sunmatrix4-mvapich2 \
libsundials_sunmatrixband.so.4()(64bit) \
libsundials_sunmatrixdense.so.4()(64bit) \
libsundials_sunmatrixsparse.so.4()(64bit)"

inherit rpm
