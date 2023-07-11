SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi4-devel-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "86e7a4c4e6c2b2db39d8343781e0628a3cc9f923e6f9530a40226b70bcccbbf742ad4e80e293d2da1954deb2d9cdc0b8cef9cacf79436ea57b89c2abe63b82c4"

RPROVIDES:${PN} += "sundials-openmpi4-devel"

RDEPENDS:${PN} += "libsundials-arkode5-openmpi4 \
libsundials-cvode6-openmpi4 \
libsundials-cvodes6-openmpi4 \
libsundials-generic6-openmpi4 \
libsundials-ida6-openmpi4 \
libsundials-idas5-openmpi4 \
libsundials-kinsol6-openmpi4 \
libsundials-nvec6-openmpi4 \
libsundials-sunlinsol4-3-0-openmpi4 \
libsundials-sunmatrix4-openmpi4 \
libsundials-sunnonlin3-3-0-openmpi4"

inherit rpm
