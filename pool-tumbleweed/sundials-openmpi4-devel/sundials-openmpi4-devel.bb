SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi4-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "f65f739503f069fc035b32dfd5f66346c6fe0033f70fc399c8d642a1763a03d8a0e6eba0590653defa197238c9688e9ac7102ea8945ebc96428e6109c629bba5"

RPROVIDES:${PN} += "sundials-openmpi4-devel \
sundials-openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "libsundials_arkode5-openmpi4 \
libsundials_cvode6-openmpi4 \
libsundials_cvodes6-openmpi4 \
libsundials_generic6-openmpi4 \
libsundials_ida6-openmpi4 \
libsundials_idas5-openmpi4 \
libsundials_kinsol6-openmpi4 \
libsundials_nvec6-openmpi4 \
libsundials_sunlinsol4_3_0-openmpi4 \
libsundials_sunmatrix4-openmpi4 \
libsundials_sunnonlin3_3_0-openmpi4"

inherit rpm
