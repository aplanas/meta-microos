SUMMARY = "Suite of nonlinear solvers - ida shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' ida solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_ida6-6.3.0-2.5.aarch64.rpm"
RPM_HASH = "3b0cdf5b3f296730f3cbed7342bb7dda83149ded15d3264eb26b5bbb842194212600e6895f53cad6af3a9a6c18b7e1672317c884aad2455510d25b8d7b554bc9"

RPROVIDES:${PN} += "libsundials-ida.so.6 \
libsundials-ida6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
