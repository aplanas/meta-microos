SUMMARY = "Qt 5 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 5 plugin for integration with flatpak and snap."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-platformtheme-xdgdesktopportal-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "74892d8cd4f4b2bbc643186c49a7eceae676b2d87a722eaab23c7054c60549f3ec1823902769af5fc25ade3e77edeaebf9aa39da738db8dc70ac766ae111f602"

RPROVIDES:${PN} += "libqt5-qtbase-platformtheme-flatpak \
libqt5-qtbase-platformtheme-xdgdesktopportal \
libqxdgdesktopportal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
