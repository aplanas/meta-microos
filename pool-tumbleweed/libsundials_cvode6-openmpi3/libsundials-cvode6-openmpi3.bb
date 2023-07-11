SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "54a7570d6bb30450e01495b0b334fec648fd5088dd2643eac907c18bdbd1c123305e31159979ce1c4f93d5a68e7d68c96e24b5d0e5940bc0a2bf4a30bf0da5a2"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
