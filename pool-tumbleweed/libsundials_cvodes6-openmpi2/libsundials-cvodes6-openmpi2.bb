SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "fb9dd038268282299da3e049b5375eecdb4ec337f7c5a6cada2ad45c5ee76e60ca1f72c45d24fecc6ad82973d7f4e8b944ed38326e93f05077b273ed399e17a3"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
