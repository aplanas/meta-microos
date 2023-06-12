SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "43b32cc63d20959f081a141b1f7d243223f2c137820a58980ab23e4658822b42cf46d13aded1b82d3d725da0af7655f01fcf064bb71d273bfe80fe2ef665d1cf"

RPROVIDES:${PN} += "libsundials_idas.so.5()(64bit) \
libsundials_idas5-openmpi1 \
libsundials_idas5-openmpi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
