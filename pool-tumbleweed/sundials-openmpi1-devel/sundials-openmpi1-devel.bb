SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi1-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "086dc7e65d5cc61e090342044af45d177027cfccddb0c6afe965fc5d061903e371f5bc18f819eb41d7580c9a667bb5e29342893a7ba53705fe12a1bf5a56bc02"

RPROVIDES:${PN} += "sundials-openmpi1-devel \
sundials-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "libsundials_arkode5-openmpi1 \
libsundials_cvode6-openmpi1 \
libsundials_cvodes6-openmpi1 \
libsundials_generic6-openmpi1 \
libsundials_ida6-openmpi1 \
libsundials_idas5-openmpi1 \
libsundials_kinsol6-openmpi1 \
libsundials_nvec6-openmpi1 \
libsundials_sunlinsol4_3_0-openmpi1 \
libsundials_sunmatrix4-openmpi1 \
libsundials_sunnonlin3_3_0-openmpi1"

inherit rpm
