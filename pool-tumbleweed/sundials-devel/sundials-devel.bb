SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-devel-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "f88f942b09f00283ba631fcac2693d0be51d81d4bc3d35ec5f09a3a06eacb0144989934936c2cfa1694693dd439f093f2403f2a6da93d3d3ea2ace0d7fcd191b"

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
