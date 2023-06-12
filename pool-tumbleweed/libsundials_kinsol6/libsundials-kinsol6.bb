SUMMARY = "Suite of nonlinear solvers - kinsol shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' kinsol solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_kinsol6-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "099e18229a7cc9aebb0ce238659914b95522ac0b4dada7a24441493cb23d2241b4531fdb4202203b1fb90cb08a44968cc063d6eb9cfa1b71e751cc150be508e4"

RPROVIDES:${PN} += "libsundials_kinsol.so.6()(64bit) \
libsundials_kinsol6 \
libsundials_kinsol6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm