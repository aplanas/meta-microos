SUMMARY = "Suite of nonlinear solvers - sunmatrix shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunmatrix shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunmatrix4-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "560ee95addcd5899017dc29926d252b19cf74328cc78801779e7b99015082a02c685bcfec8f9ee7bffc6c5f724fc8cdfddaf7e6ef43148b45cb906ae36353167"

RPROVIDES:${PN} += "libsundials-sunmatrix4-openmpi3 \
libsundials-sunmatrixband.so.4 \
libsundials-sunmatrixdense.so.4 \
libsundials-sunmatrixsparse.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
