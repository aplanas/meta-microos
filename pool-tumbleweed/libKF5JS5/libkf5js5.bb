SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5JS5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "30ff39442a87e417cbeeea925fbbaad1b999136defc78a03e405e680588410224594fd85c5c4824834edd5230a0f08ca9428e9e70b60a2552340382a6580891a"

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
