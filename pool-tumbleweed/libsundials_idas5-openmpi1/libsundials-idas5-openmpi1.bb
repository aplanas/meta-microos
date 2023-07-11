SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "2df8c7c49ea6682f09f55bc997bd4ff28aadb443de721bbaf06c297d384e0aa000e1de6c021635086ab8231b0d22cba3bc50ffa41c808ae0dac4e1b58abf3189"

RPROVIDES:${PN} += "libsundials-idas.so.5 \
libsundials-idas5-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
