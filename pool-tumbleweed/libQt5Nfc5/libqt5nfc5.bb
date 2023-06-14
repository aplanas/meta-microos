SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Nfc5-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "80e1ef1a113c1b378c43b7425385851c33f21be444f8addd0dc477db27738b093413b483914bd481767a4066336fa51a515f49be36d3dc651ff71b4b1da6a3c2"

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
