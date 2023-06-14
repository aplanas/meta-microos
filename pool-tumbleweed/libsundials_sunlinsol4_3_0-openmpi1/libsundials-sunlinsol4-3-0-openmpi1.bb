SUMMARY = "Suite of nonlinear solvers - sunlinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunlinsol shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunlinsol4_3_0-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ff893b03580fab56ca44b744c01719e32391caab35ec5d458a9ae83cac3a861d492f31a84a4b8567f52705aa744f1ee07cf2c136bd9f4ba199c4e98a9caa917d"

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
