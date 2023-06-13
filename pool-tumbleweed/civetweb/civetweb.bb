SUMMARY = "A C/C++ web server"
DESCRIPTION = "civetweb is a C/C++ embeddable web server with optional CGI, SSL and Lua support."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "civetweb-1.16-1.1.aarch64.rpm"
RPM_HASH = "bc00c7bb94aa71962f01f73894f819a76ff82808c469481d840c12f92d6b8a841b339aa0901b54e2a348b24969858eebf0223e5430cf1c277c255b9f33b74b96"

RPROVIDES:${PN} += "civetweb \
civetweb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcivetweb.so.1.15.0()(64bit)"

inherit rpm
