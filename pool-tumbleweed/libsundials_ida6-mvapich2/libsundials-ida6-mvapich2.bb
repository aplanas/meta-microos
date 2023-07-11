SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "a7b7451530b1b2030de282b484952ec33753fd46e68d24a328ef3cb9ccce3f6370e151aa2c405534c0d0dbfedcdca2a705b8ed9edb597028facfea47d1e358de"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
