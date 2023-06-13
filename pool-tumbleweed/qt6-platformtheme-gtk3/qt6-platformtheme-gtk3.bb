SUMMARY = "Qt 6 GTK3 plugin"
DESCRIPTION = "Qt 6 plugin for better integration with GTK3-based desktop environments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformtheme-gtk3-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c007b5f6da656d57f38bb787a1c5d70789a40c523ed46c094bd3468de694e72ce4cf211736d74ad02f79ec6f32403334ea9c5041f6d95a0df79fe01f26a3931a"

RPROVIDES:${PN} += "libqgtk3.so()(64bit) \
libqgtk3.so(Qt_6)(64bit) \
qt6-platformtheme-gtk3 \
qt6-platformtheme-gtk3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui6 \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
