SUMMARY = "A C/C++ web server"
DESCRIPTION = "civetweb is a C/C++ embeddable web server with optional CGI, SSL and Lua support."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "civetweb-1.16-1.2.aarch64.rpm"
RPM_HASH = "07ac3013d05ac53d2a8fb5a898a324e9bf7134d318ff5677e2cc5bc8289dc6bb0ac5488080ec64861a21c895105be4f002fef78149183a30b21b58d7cf9cf0b9"

RPROVIDES:${PN} += "civetweb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcivetweb.so.1.15.0"

inherit rpm
