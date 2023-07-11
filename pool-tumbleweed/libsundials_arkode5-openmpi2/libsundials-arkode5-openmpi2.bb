SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "590b816df4ffdfd29e13861aa199b5d4a9a96ee54bcdb820cbb7192c91def103b05d1ee14db01195b1c888c56c9b16167135e9ae957d46da2ca5b63fb3e99fc5"

RPROVIDES:${PN} += "libsundials-arkode.so.5 \
libsundials-arkode5-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
