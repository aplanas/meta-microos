SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "00eacf7175335366354c5d694eba92714c983d3dd08f7d4c7c976cf0ea760774a3d86fcbd9712eda92f076d75b2b073eac66ff0ce693e7b78916120e2543b739"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
