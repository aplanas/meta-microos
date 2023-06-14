SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "775bab39ff2d7081e48ded9aa5ccaee85ca328d027be7869ade28e05f462ca2c42df6952685b3acf08eaeeaf4ea103f94153e30e3333602a5439750ab147c8ae"

RPROVIDES:${PN} += "libsundials-cvode.so.6 \
libsundials-cvode6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
