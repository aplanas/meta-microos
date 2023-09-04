SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5JSApi5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "aafadb2302468c0b25b3624c11209a786fe2694660470270ae6acbc741e8c97d3af695f6f932f40ad35e20d79c6f9170532e68bf80b00e1dad6d3fdbbdddf95d"

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
