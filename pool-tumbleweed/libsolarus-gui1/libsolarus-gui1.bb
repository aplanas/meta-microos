SUMMARY = "Solarus game engine shared library (GUI parts)"
DESCRIPTION = "This package provides the GUI shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus-gui1-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "0ddb36bf1897c6d894c10378e629e73b91fa2655b11cdf8e9d1a4ecfeb40514f7b59bd9f41b134a6fe054084bca812f445efc82fce8c65ab320154143ca1346b"

RPROVIDES:${PN} += "libsolarus-gui.so.1 \
libsolarus-gui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libsolarus.so.1 \
libstdc++.so.6"

inherit rpm
