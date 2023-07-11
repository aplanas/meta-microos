SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "5f927cee1d28079aaaeb2163194f337b6d8bcaeb728deeecbad9fceca360d849531ba514373f8b6a4f42bd247981f80d1d10bcb3962cf5c86abf234db5200ec7"

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
