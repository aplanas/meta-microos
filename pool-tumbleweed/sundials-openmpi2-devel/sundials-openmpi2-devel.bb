SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-openmpi2-devel-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "11673de5b0f14aff872b3a8c8534e77e97965ae425292e66be2436a0e3c5c0aaf0924e131f0f7c736e41501c6c6b991a888dc0cbd090e93d17e6839e2f2321c2"

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
