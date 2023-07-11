SUMMARY = "Qt 5 gtk3 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk3-based desktop enviroments."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-platformtheme-gtk3-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "8365a66a01db9688045fe89166d4483efdc4279096fd687de1e2281a5d0184213d38baddba424f488d5d9c53149c550d9070172340ce4b747f0edb94ff0d3326"

RPROVIDES:${PN} += "libqgtk3.so \
libqt5-qtbase-platformtheme-gtk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
