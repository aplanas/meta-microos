SUMMARY = "Suite of nonlinear solvers - arkode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' arkode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_arkode5-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ffcadde40f0fefa1f40eb29db1037a508d6d14cb871f80239d6d251c16e134c8e08a8ac39a3d5db12b71c71759f0df6a5707046e032a2340af13560fc08ae6b3"

RPROVIDES:${PN} += "libsundials_arkode.so.5()(64bit) \
libsundials_arkode5-openmpi3 \
libsundials_arkode5-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm