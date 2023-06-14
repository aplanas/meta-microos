SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "b43f6ae03360783e85e6ccc421a3b7633370156ad58920390dc2d83e8b9f08f0ac1bb54838943f23745c673d4c52bca5ddf4fcfa90b266d68d38f66d9fffcde1"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
