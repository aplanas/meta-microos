SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "7b738d5d09793f77654a5e96beb8240c1425064b0c6567c544a803115492487377c9fc5e6c0358fadb841d15fabb53ebcada1a5e06322d25f65914ac50ce1f2a"

RPROVIDES:${PN} += "libsundials-arkode.so.5 \
libsundials-arkode5-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
