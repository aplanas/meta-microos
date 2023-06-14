SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "c180b911e01b9ee29f9b0b5920f683cfeca613c094ae4e289e8143ed2a9b426df84eb561ebdfe67c84b56018a10f5caeb536ebe5faf0cb4b4ef0673155033831"

RPROVIDES:${PN} += "libsundials-nvec6-openmpi1 \
libsundials-nvecmanyvector.so.6 \
libsundials-nvecmpimanyvector.so.6 \
libsundials-nvecmpiplusx.so.6 \
libsundials-nvecparallel.so.6 \
libsundials-nvecpthreads.so.6 \
libsundials-nvecserial.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12"

inherit rpm
