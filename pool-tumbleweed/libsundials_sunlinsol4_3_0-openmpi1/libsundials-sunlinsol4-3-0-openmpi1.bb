SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ff893b03580fab56ca44b744c01719e32391caab35ec5d458a9ae83cac3a861d492f31a84a4b8567f52705aa744f1ee07cf2c136bd9f4ba199c4e98a9caa917d"

RPROVIDES:${PN} += "libsundials_sunlinsol4_3_0-openmpi1 \
libsundials_sunlinsol4_3_0-openmpi1(aarch-64) \
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
libsundials_sunmatrix4-openmpi1 \
libsundials_sunmatrixband.so.4()(64bit) \
libsundials_sunmatrixdense.so.4()(64bit) \
libsundials_sunmatrixsparse.so.4()(64bit)"

inherit rpm
