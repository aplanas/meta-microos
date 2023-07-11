SUMMARY = "A simple GNU social client written in C++/Qt"
DESCRIPTION = "Yaics is a simple GNU social client written in C++ and Qt and \
licensed under the GNU GPL 3.0 (or later)."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "yaics-0.6-2.10.aarch64.rpm"
RPM_HASH = "7164adc722a6cea674e4824ed88637c3faddaae31d4b49d8c5810def04b5494ad1e5fae0b87206968aa76181b459c27fb9a35ab42979ca82144881ed3371bc3e"

RPROVIDES:${PN} += "yaics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
