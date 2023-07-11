SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "0c25d027940d3b783b8b4377138c23760ada4ac63b091ee29953607ae4661c865ff0c690221d34222957c41a5710b9aa27aeb2f635c2013cc342405653f7fb4d"

RPROVIDES:${PN} += "libsundials-idas.so.5 \
libsundials-idas5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
