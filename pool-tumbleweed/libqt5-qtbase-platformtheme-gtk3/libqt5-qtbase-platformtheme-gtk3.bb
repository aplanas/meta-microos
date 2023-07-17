SUMMARY = "Qt 5 gtk3 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk3-based desktop enviroments."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-platformtheme-gtk3-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "1c9bd7f8988616ebf021f1ee8782899ef0b19436b27b00a6b301dcf308d6151316c5b5b706f989e843e98538866005530c438a611dd63e3d17d885ec8b94f324"

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
