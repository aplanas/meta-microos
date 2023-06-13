SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "a60e4aab632386ff6e4dbab31d743a59b2360de9d21da9b49c0e758a517fd2425817bf024191f9858bc25a1eeeed8c12369fd599a3a819c63cafef8acd74c917"

RPROVIDES:${PN} += "libsundials_ida.so.6()(64bit) \
libsundials_ida6-mvapich2 \
libsundials_ida6-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
