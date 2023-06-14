SUMMARY = "Qt 5 gtk3 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk3-based desktop enviroments."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libqt5-qtbase-platformtheme-gtk3-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "df16091214e7eae907e63863bece682206403af3766a53aea1420a7e4bc85ffac22ad91d6d9fde13353ad54eeb7b30c1975774f3fe037ccf944a4975bb20b40f"

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
