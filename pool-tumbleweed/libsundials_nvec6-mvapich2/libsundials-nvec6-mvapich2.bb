SUMMARY = "Suite of nonlinear solvers - nvec shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' nvec solvers."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_nvec6-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "2aaaa9f601c388e5ec32f9645885e1fa5a4170fee90697d28b85b22aaad2c8e32c9a3f04abf48890f16a00fc8114f375be5c70cf276f1bcc80005a4f0fe29fa2"

RPROVIDES:${PN} += "libsundials-nvec6-mvapich2 \
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
