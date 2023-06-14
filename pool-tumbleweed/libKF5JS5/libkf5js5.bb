SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5JS5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "0dd48242f8f2f8c22961c7f7e9efe837ab4d84105576fcb003bb9d60887a231ba3e9115c4cc121757747562dcfbd62b54693c7e6e6d16ea3205178ded9a50394"

RPROVIDES:${PN} += "libKF5JS.so.5 \
libKF5JS5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
