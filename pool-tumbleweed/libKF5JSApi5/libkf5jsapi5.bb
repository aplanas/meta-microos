SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5JSApi5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "f2aea4c58de06683c91c0ae852ae56ea95a402156a51e136535429323071688083d6d5f33b5c0b0c70d2d2e2e733e5d62cd5ea14020941a6b55f84e9b9b8dd02"

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
