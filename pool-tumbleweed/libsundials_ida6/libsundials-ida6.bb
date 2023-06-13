SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "8294df24a959e20b6dd57f9d91ab18cde3e4fd94e6400e5c7b33d1b04af74ed32cf210d471076a86b3861ddd9a6858202daf3b93ceb941d32774250d7497f27d"

RPROVIDES:${PN} += "libsundials_ida.so.6()(64bit) \
libsundials_ida6 \
libsundials_ida6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
