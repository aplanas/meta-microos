SUMMARY = "KDE Javascript engine: Build Environment"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kjs-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "c65fcd392a35a9048de101bdab0a6336254a351bedf51892f8397958c9891ff674ba4f6ad39a7fea6cd7cb281ad3eefc1e5fd8643c60be11ead1d5f00186e6af"

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
