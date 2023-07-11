SUMMARY = "Suite of nonlinear solvers - cvodes shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvodes solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvodes6-openmpi1-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "9f243f12759c331fbf18203d361e1ab9c6bcce0938f526338e3caafbe559e829b2a1a82da6918585bf202dc59b28042fc6808729a41d516180f0ed434d506157"

RPROVIDES:${PN} += "libsundials-cvodes.so.6 \
libsundials-cvodes6-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
