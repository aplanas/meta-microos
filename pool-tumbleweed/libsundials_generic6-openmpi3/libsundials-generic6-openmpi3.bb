SUMMARY = "Suite of nonlinear solvers - generic shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' generic solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_generic6-openmpi3-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "04daed1e905b2aa4cc510b45b9bc49268d79ec2e551e3616e4edaf11b69aba9af19fa29848694bbfdc73c474b0aeef1379932d8ba8a7694ab09c56c617188550"

RPROVIDES:${PN} += "libsundials-generic.so.6 \
libsundials-generic6-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
