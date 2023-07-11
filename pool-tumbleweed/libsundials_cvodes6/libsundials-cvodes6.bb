SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "616f1c37e5b4fe78e5feb3a963e08305926ebd08b52cdd8f7aa1da7ffc9bc7ea45ca1172aaea47a2c0a001293809e20c9a29accce20dc07a1a38aee3b32b13a1"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
