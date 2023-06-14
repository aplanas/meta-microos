SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "432faade1231ea4a930d56a50fca9bf1b6dfd664522b8b5e6357c598c3e64442b0f13f79db518b93720862429632acc920d72c3fe6f2645f620a99b64bd9d65a"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
