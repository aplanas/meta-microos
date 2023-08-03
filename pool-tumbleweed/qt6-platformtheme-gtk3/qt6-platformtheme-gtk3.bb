SUMMARY = "Qt 6 GTK3 plugin"
DESCRIPTION = "Qt 6 plugin for better integration with GTK3-based desktop environments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformtheme-gtk3-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8ea8624716bf1c0c79a12142854ecdc592a0ade41f5dc6e4ff89a8fae6abc38d072ebef25a76d5cbdf6d5d778a16b77f4ae103fb18c57646e218411d8f89c0be"

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
