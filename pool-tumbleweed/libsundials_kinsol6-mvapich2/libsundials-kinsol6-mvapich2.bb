SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "e4cbf2a21c3303dbdac94eddc825453708ee17be396e8b3af99e0c5fa792b7b4e59fa4f6fb3e64524f81e21d2dc1dc8a960b80f44a0a8720df3fdf034d79f7a8"

RPROVIDES:${PN} += "libsundials-kinsol.so.6 \
libsundials-kinsol6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
