SUMMARY = "KDE Javascript engine: Build Environment"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kjs-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e2c304b0376cc20f871c1794d3a0ca3ce53441bbb5b4dc57a27e9f7eb097bd750025fb8071b25fd0b5b8114b4e8e10cdb904c573633bf29068b5afd353f2167a"

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
