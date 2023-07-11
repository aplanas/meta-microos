SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "a32f807162b48c61864019e2635909ac0e5ea88ed237b1ce08d1e3a7b5de7c2cf299b88237f49dde7b98f7f23408a6d805126826e07050733184489d020f2006"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
