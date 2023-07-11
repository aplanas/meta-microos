SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "40d3ff54675b82ed8a268fea144d24c285b098801fba826db91e41309ce4c619f8a66a19bc4521841d0f06ac3ce1af92ac9b728b13a576a9207e421f66d5aebb"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
