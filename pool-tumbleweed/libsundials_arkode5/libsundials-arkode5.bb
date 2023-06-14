SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "bede33631c1d9a413b769a72fc1e3502542d54b3a822fe2fdb98fc9c4ebf93e23d45d7cb4fdff618fdca2eda6c16b3704daea6a69ddb86c6ab04c076a757285b"

RPROVIDES:${PN} += "libsundials-arkode.so.5 \
libsundials-arkode5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
