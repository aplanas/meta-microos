SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi1-devel-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "a7f61b8461e71887e264d4922a0559d0f6cc46602ce68b9fea3ad47f959e7b07dc789cdc9a49029ee922c77b6ec28980e676a2a1053a3acba65443112a9a8176"

RPROVIDES:${PN} += "sundials-openmpi1-devel"

RDEPENDS:${PN} += "libsundials-arkode5-openmpi1 \
libsundials-cvode6-openmpi1 \
libsundials-cvodes6-openmpi1 \
libsundials-generic6-openmpi1 \
libsundials-ida6-openmpi1 \
libsundials-idas5-openmpi1 \
libsundials-kinsol6-openmpi1 \
libsundials-nvec6-openmpi1 \
libsundials-sunlinsol4-3-0-openmpi1 \
libsundials-sunmatrix4-openmpi1 \
libsundials-sunnonlin3-3-0-openmpi1"

inherit rpm
