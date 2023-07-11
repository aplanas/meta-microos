SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "1b81e4e263295fdb0085f47230e7f2d0dddb7db7a1392c3446fe0ca924ec317c7afd85ad9c36220615dcfd2c2be66428f702a590e877dbc98aa9f285ba7f974a"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
