SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-mvapich2-devel-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "0163e828121b9eef157d7bf712114b69bfd763fce821de6d7325d82b3ce16862ca0510b2a9cb0bf42d55e4417e83b56358a10fc858d5e02999a2bb4709ab3e34"

RPROVIDES:${PN} += "sundials-mvapich2-devel"

RDEPENDS:${PN} += "libsundials-arkode5-mvapich2 \
libsundials-cvode6-mvapich2 \
libsundials-cvodes6-mvapich2 \
libsundials-generic6-mvapich2 \
libsundials-ida6-mvapich2 \
libsundials-idas5-mvapich2 \
libsundials-kinsol6-mvapich2 \
libsundials-nvec6-mvapich2 \
libsundials-sunlinsol4-3-0-mvapich2 \
libsundials-sunmatrix4-mvapich2 \
libsundials-sunnonlin3-3-0-mvapich2"

inherit rpm
