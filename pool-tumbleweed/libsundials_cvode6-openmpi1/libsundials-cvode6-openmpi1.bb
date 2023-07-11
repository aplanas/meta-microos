SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "7395a85804a1ff92ac73c2994c2801666e8cacfde41440896ed1f81091dc28f39f9ff9f4067a8c90c45db225f2deaf6c7540a8baa8a64976e51de30ec22527bb"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
