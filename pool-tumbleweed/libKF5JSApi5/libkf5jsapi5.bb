SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5JSApi5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "edb8aace9e01cfdd0a2d3303d10d88546e31917d168b649fd2147c1ee6779b6fb66cc80fe0a102446b36ef5a5d859e1da3264d10548a755ef2849974604c91ac"

RPROVIDES:${PN} += "libKF5JSApi.so.5 \
libKF5JSApi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5JS.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
