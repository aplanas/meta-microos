SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "af776d26387367110e52f7b730e922f9be3f73830ebb84269f6e7d7f946f4901b6fae6ca68c29ce863a3fcb65c388673707f4d727c08953c1351f017e18751d1"

RPROVIDES:${PN} += "libsundials-arkode.so.5 \
libsundials-arkode5-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
