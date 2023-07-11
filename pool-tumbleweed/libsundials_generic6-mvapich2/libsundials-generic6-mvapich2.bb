SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "d0a408227c30c24a1c66e2ca499aef490b6a66ae3175173ab215265b99a0c16747c2274c605f3a025f93088d8d29204ca4ccd15e8bca05df37f97167ec079a20"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
