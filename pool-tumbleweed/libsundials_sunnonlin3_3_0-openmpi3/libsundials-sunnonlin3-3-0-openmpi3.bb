SUMMARY = "Suite of nonlinear solvers - sunnonlin shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the sunnonlin shared libraries for SUNDIALS."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_sunnonlin3_3_0-openmpi3-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "37df3a26ce6ebd2b114d6fe728d6761026d9e56203a9bfeae52ea6df49255c6c2db87a8f7deb5b6f89f63ed718cd01f8c5d9b0f4d93b9bd096bf6e3a2190826d"

RPROVIDES:${PN} += "libsundials_sunnonlin3_3_0-openmpi3 \
libsundials_sunnonlin3_3_0-openmpi3(aarch-64) \
libsundials_sunnonlinsolfixedpoint.so.3.3.0()(64bit) \
libsundials_sunnonlinsolnewton.so.3.3.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
