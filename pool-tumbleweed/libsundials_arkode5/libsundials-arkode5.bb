SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "c0239215373d8bedc442369eac39bc84d4fb78c029d3fb8d22301027a45035bd3c24a138a8610f7b3ede634c0cc17f8cf0dc12e59ce2b80664e2b29ab5989108"

RPROVIDES:${PN} += "libsundials-arkode.so.5 \
libsundials-arkode5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
