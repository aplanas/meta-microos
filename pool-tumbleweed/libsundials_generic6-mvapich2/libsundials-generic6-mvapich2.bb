SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "e6016deea151a28754e18f379946ff39117c99dbe519c54c8fe62e8f17bdeb815b5946fc315632fac1a66ad1f6eae275cd663a9e8e4114f4feee156d243a6ba7"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
