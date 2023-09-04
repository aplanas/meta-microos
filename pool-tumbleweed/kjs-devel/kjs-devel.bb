SUMMARY = "KDE Javascript engine: Build Environment"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kjs-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "63e8b9cd1b0b42d8b16971a56210404d66f466045bea780a1935d3291eade785b2396766b4fbf2067680230ddc036cad18614715d2c04289ec3a1db7c0d76f20"

RPROVIDES:${PN} += "cmake-KF5JS \
kjs-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
cmake-Qt5Core \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5JS.so.5 \
libKF5JS5 \
libKF5JSApi5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
