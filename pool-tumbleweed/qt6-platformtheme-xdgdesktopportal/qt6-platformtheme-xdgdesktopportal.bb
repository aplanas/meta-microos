SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f75ef0d3ca6f34a4310d068de5eb9ddefe87983e5c8b05e22b929acb4b3dccccd6c3861f567f05f1e7c78a68f4fe55235b842fd4a4cda292f18f5134478b0444"

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
