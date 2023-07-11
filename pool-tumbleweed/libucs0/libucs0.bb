SUMMARY = "Infiniband Unicified Communication Services"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucs0-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "2b4bee2d36752e814524dbbd5bc62613272fcf2a696314738b82e6a22835c392d8608e71b1359d89ab223458408ab65e4481172706cf59a1329a5027f90e25d4"

RPROVIDES:${PN} += "libucs-signal.so.0 \
libucs.so.0 \
libucs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnuma.so.1 \
libucm.so.0"

inherit rpm
