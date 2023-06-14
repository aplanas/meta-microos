SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "2f5b11a297ca74f87736851ee3905e4a1eba1b476f4d5b5f61d8365a8399c6d125e99dc79a5f178194045b96b06554483464fac1aca41688d24b3ab6fce675f9"

RPROVIDES:${PN} += "libsundials-nvec6 \
libsundials-nvecmanyvector.so.6 \
libsundials-nvecpthreads.so.6 \
libsundials-nvecserial.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
