SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "6435bb52b8af249e46be923c8b77bd28678b1d2cffb5e2d49dabfb26cc9815899b147b9ef2fa99758c5faab11fb7e2d1455e7c09e4c0c8fd248f843d734570df"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
