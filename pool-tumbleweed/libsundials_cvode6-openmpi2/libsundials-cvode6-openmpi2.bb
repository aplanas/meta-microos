SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "116cc4452a57b20f1d52fae67adfc2467cfeb99bfa2aa29cc48799a7f6abaca3a1a87876928a903390f41f9c033d3be70499e73eaf9310ac7ef8d626db3cf224"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
