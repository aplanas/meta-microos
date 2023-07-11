SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "e925f566c064473affa5d7f9e1356b68b3a453a7bdd63eb3faa416f45381df437ed0cd552a3fa1ef1c6681f285fdf05482faa020df6c95d21f622f9ef7aeda29"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
