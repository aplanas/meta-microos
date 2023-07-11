SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "7a2edc7a05e013532230dc1659c405b3fe9cf3582f92dee62305e6a7fbdbbb12bc00b29832187b8901b775be1cca0ba64520a2794cac02c8c0a4b4c209560673"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
