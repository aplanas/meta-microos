SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "711e5055716df36bca1de42a9c8c64eba805ab4905401f375a40e790b8834e090b51703bde4c650ca0167eae9eb0f4c4afe83d77ed070556c8cf44e09a5012ab"

RPROVIDES:${PN} += "libqxdgdesktopportal.so()(64bit) \
libqxdgdesktopportal.so(Qt_6)(64bit) \
qt6-platformtheme-xdgdesktopportal \
qt6-platformtheme-xdgdesktopportal(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui6 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
