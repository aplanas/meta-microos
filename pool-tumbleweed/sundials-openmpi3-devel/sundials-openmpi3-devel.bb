SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi3-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ff0be968fd324e380baec2707957141c551b49d5db9245b77c57d029d497277c72b4405ca53ca6676398a32e8385ea72b6faaa68f75cff6d9d198950f02ceca2"

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
