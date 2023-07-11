SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi2-devel-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "358b95cebee5c86843bd6b359856fad41c617046c6d3b61a9206a747f9298395bc898e3e9c322eb998e617662bfe69b3e108225bdcc7d375482485f3e4ed892b"

RPROVIDES:${PN} += "sundials-openmpi2-devel"

RDEPENDS:${PN} += "libsundials-arkode5-openmpi2 \
libsundials-cvode6-openmpi2 \
libsundials-cvodes6-openmpi2 \
libsundials-generic6-openmpi2 \
libsundials-ida6-openmpi2 \
libsundials-idas5-openmpi2 \
libsundials-kinsol6-openmpi2 \
libsundials-nvec6-openmpi2 \
libsundials-sunlinsol4-3-0-openmpi2 \
libsundials-sunmatrix4-openmpi2 \
libsundials-sunnonlin3-3-0-openmpi2"

inherit rpm
