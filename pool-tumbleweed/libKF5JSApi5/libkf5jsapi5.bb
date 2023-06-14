SUMMARY = "KDE Javascript engine"
DESCRIPTION = "This library provides an ECMAScript compatible interpreter. The ECMA standard \
is based on well known scripting languages such as Netscape's JavaScript and \
Microsoft's JScript."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5JSApi5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "32e9fde2047ff9a9a5dd029a7dc05690541ae40e6890c457517441e153cb087d464176e868dbe3fc26cb8f208de22d4d65528c72b7e76aca48f4ddaaf5d9fdbb"

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
