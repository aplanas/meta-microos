SUMMARY = "Solarus game engine shared library (GUI parts)"
DESCRIPTION = "This package provides the GUI shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus-gui1-1.6.5-2.16.aarch64.rpm"
RPM_HASH = "573a3d803b683734d9573929eab0061ea7f76955fe6afc86c0436a78cfe6b98deb738aadb14c659f5dd2554077c87bd9228ef4bda77072d10a16d42e7748d0af"

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
