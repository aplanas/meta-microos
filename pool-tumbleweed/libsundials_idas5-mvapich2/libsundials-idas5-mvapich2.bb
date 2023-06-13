SUMMARY = "Suite of nonlinear solvers - idas shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' idas solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_idas5-mvapich2-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "2adc79c5de4bc4b59ea1561e198727dacf76056deb5b297348266ad973754b481a132b8f59af869918664912d3cea1ef115d3a62d51435bbc4f7d40b1a11e44a"

RPROVIDES:${PN} += "libsundials_idas.so.5()(64bit) \
libsundials_idas5-mvapich2 \
libsundials_idas5-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
