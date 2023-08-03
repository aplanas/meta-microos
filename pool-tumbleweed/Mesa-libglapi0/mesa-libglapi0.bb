SUMMARY = "Free implementation of the GL API"
DESCRIPTION = "The Mesa GL API module is responsible for dispatching all the gl* \
functions. It is intended to be mainly used by the Mesa-libGLES* \
packages."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libglapi0-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "6f45208c7b71c2a08654f17fd9946b9824154c4da95bed95a737d8d64f60b45b40ba7232b74d16455d522a5a039047800275152706239fbe197d7f32f3b63f73"

RPROVIDES:${PN} += "Mesa-libglapi0 \
libglapi.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
