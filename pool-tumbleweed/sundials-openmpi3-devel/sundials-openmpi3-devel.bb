SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi3-devel-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "ea868448dec236d3e9f61a980d7564844dc749c370e63632c747b824a2cefd3dcc34dc25951bfcff45c156dbcce0887ba5a04727e02089484b74825a8cbb979a"

RPROVIDES:${PN} += "sundials-openmpi3-devel"

RDEPENDS:${PN} += "libsundials-arkode5-openmpi3 \
libsundials-cvode6-openmpi3 \
libsundials-cvodes6-openmpi3 \
libsundials-generic6-openmpi3 \
libsundials-ida6-openmpi3 \
libsundials-idas5-openmpi3 \
libsundials-kinsol6-openmpi3 \
libsundials-nvec6-openmpi3 \
libsundials-sunlinsol4-3-0-openmpi3 \
libsundials-sunmatrix4-openmpi3 \
libsundials-sunnonlin3-3-0-openmpi3"

inherit rpm
