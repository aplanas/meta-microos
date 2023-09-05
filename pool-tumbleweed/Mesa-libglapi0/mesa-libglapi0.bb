SUMMARY = "Free implementation of the GL API"
DESCRIPTION = "The Mesa GL API module is responsible for dispatching all the gl* \
functions. It is intended to be mainly used by the Mesa-libGLES* \
packages."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libglapi0-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "828fc066af348ef4329c920ad892c7a17656a93dfbba0c7281a868508296f04831efbe247469dae2acd761f422587e27f06b553817c3135399afe31367a3af21"

RPROVIDES:${PN} += "Mesa-libglapi0 \
libglapi.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
