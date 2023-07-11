SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "cd6e2b9442e1a18818e0af7b223b14c2a93be96e6657b365e7b7f6b68bef8eef1c645b5cb05418b4ee62fca3b261c926422192e2acb48a6cf96b7b45514b3433"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
