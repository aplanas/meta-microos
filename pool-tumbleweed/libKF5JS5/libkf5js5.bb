SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5JS5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "a2d51a121a07a2b3a9e3a83e5d18b5bd30e77b854ed5dcfb07c1d6a92397a4b4fc53005f312f2c4c775233c2bb3c8e21ef697c5902214111cc71116c8567b2aa"

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
