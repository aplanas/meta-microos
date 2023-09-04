SUMMARY = "Free implementation of the GL API"
DESCRIPTION = "The Mesa GL API module is responsible for dispatching all the gl* \
functions. It is intended to be mainly used by the Mesa-libGLES* \
packages."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libglapi0-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "712734bf6812fb3a9c1325d11d91c9d054c8b8a071e012b4a2018224c3c37c8686b05451d3c6a15cf743af0c1058751a06edd568495d6628ff23f3085231630e"

RPROVIDES:${PN} += "Mesa-libglapi0 \
libglapi.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
