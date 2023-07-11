SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-openmpi4-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "a7df8a7ba407cf81cd0504626f38deb27237bbc4a86568653c2ca211e836f0528e6bddf767526749089f6ea7dd5036f5cdb9e1e72081645c4c7a62f28c489f1e"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
