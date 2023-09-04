SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5JS5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8f1d06385ba522c4ee626b79face2ef55de1bf62b64b2d541bf514416aaf7d43227de5159f6b363f655950069f5a377cfa4a2075cf57f5f88da99044decaaec6"

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
