SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "a692bcdf5a678904415e2b6fe8ca36a83d1766e78232c1d088b919d308155d45909baad4b65c89c3dc016d970d9c65365cd370a5c02ef2752af95cd3f9685303"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
