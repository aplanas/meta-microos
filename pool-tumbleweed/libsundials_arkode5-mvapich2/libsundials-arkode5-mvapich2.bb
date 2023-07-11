SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-mvapich2-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "eac7bc35a6ca30d72c87727f0028b7b45daff0fd5f1254904ec53c0ab46eeafe62304ede432141e187c75466ef33e088679b153131d0c7211061abc2f4539d78"

RPROVIDES:${PN} += "libsundials-arkode.so.5 \
libsundials-arkode5-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
