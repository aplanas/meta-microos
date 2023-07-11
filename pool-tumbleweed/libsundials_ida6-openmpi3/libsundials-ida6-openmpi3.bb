SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "951795b1a99c7f1d881e2e72cdb611c91b38c745f8114b0ad835cbcbedc13b0ce94fab69b101d646a2c632e8f76f1d9164926dbe561c06df38f8286a32802d51"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
