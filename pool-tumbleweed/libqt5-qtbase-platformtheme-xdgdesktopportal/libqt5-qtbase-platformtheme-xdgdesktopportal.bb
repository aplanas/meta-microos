SUMMARY = "Qt 5 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 5 plugin for integration with flatpak and snap."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libqt5-qtbase-platformtheme-xdgdesktopportal-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "7f7407ccec6f469573020c5f88576e335063f13aa4df3c65acda063df0cd768e9c8ebd10629e94ec1bc127a9d386f7804340b932729fc927702a4f149f11f160"

RPROVIDES:${PN} += "libqt5-qtbase-platformtheme-flatpak \
libqt5-qtbase-platformtheme-xdgdesktopportal \
libqt5-qtbase-platformtheme-xdgdesktopportal(aarch-64) \
libqxdgdesktopportal.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
