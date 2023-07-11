SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "047d603238ee123373fddc8230d309d1a23bd8e99a782dfa4adf6fe9f5883c413520b39ea09d2df8a09e9b79e09bd1494ae240da6a82f5117df48a44b36e402a"

RPROVIDES:${PN} += "libsundials-idas.so.5 \
libsundials-idas5-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
