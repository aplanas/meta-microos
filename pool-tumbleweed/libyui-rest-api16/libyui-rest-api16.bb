SUMMARY = "Libyui - REST API plugin, the shared part"
DESCRIPTION = "This package provides a libyui REST API plugin. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API, it is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-rest-api16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "a9cfea0386bd7419282369084ec7c6b1ee7d758d97ee5cb3a5869b819ca33b85b68892e1ca1fb62f1c8e8e4a3b927edbc16f59a4408d5c95df298f733a832ef9"

RPROVIDES:${PN} += "libyui-rest-api \
libyui-rest-api.so.16 \
libyui-rest-api16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libmicrohttpd.so.12 \
libstdc++.so.6 \
libyui.so.16 \
libyui16 \
yui-backend"

inherit rpm
