SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "208a232f01d29773001a3d9f5cfa629c9949027368ab6bab8687d802ed14967ceaa13c847fdd0c48d1b19d1be807b65a540a908c60dba04f1bf288d4b830ec74"

RPROVIDES:${PN} += "cmake-SUNDIALS \
sundials-devel"

RDEPENDS:${PN} += "libsundials-arkode5 \
libsundials-cvode6 \
libsundials-cvodes6 \
libsundials-generic6 \
libsundials-ida6 \
libsundials-idas5 \
libsundials-kinsol6 \
libsundials-nvec6 \
libsundials-sunlinsol4-3-0 \
libsundials-sunmatrix4 \
libsundials-sunnonlin3-3-0"

inherit rpm
