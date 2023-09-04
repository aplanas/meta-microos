SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "11c604283365cbcd668da16a7bff584ec409ab4e3c6172ffd66017ad226d9126d7060142fc1a50010ce01ed4bcf72277e76c0793fd4e5572b9801df7367966f2"

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
