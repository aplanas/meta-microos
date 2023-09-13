SUMMARY = "Free implementation of the GL API"
DESCRIPTION = "The Mesa GL API module is responsible for dispatching all the gl* \
functions. It is intended to be mainly used by the Mesa-libGLES* \
packages."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libglapi0-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "65610c9f7e80f81dbfe4865ecb94c1226318f94be569131acdd07cbb19c23d000f0821031872da6d939ad32e594ec44f44d026c52e36831689e27065922e37a9"

RPROVIDES:${PN} += "Mesa-libglapi0 \
libglapi.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
