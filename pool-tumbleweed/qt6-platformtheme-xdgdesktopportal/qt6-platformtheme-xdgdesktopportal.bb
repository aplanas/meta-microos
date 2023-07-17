SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "a541f0435599797ccc195ccda77b7aa27063f862bbd0f3c3c9c1f7e4cbaff75dde7416504defdac329f043154443133b10893e8984f161450cbfd6b1de952186"

RPROVIDES:${PN} += "libqxdgdesktopportal.so \
qt6-platformtheme-xdgdesktopportal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
