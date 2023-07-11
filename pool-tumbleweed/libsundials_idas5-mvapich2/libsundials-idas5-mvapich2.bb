SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "d075b913ecd58cfa1ea9dd3aeb855005eee53e9034d001fc2d70717600db4edac53ce5d59ea65cd3f95f82be57a7b256e206d4a3402c3e7175b11bda6c0125f7"

RPROVIDES:${PN} += "libsundials-idas.so.5 \
libsundials-idas5-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
