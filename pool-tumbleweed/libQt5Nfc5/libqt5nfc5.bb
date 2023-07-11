SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libQt5Nfc5-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "d15e9154b265e622a3994bc32db52789b66a94c2cea3e3bf0c9a8e33a7c2ff7736609a35eb6cd7826ba37c9d10bc8ac9848c1aa0a24b2995e857c8dacf6f616b"

RPROVIDES:${PN} += "libQt5Nfc.so.5 \
libQt5Nfc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
