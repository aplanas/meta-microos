SUMMARY = "Qt 6 GTK3 plugin"
DESCRIPTION = "Qt 6 plugin for better integration with GTK3-based desktop environments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformtheme-gtk3-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c007b5f6da656d57f38bb787a1c5d70789a40c523ed46c094bd3468de694e72ce4cf211736d74ad02f79ec6f32403334ea9c5041f6d95a0df79fe01f26a3931a"

RPROVIDES:${PN} += "libqgtk3.so \
qt6-platformtheme-gtk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
