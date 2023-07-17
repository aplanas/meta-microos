SUMMARY = "Qt 5 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 5 plugin for integration with flatpak and snap."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-platformtheme-xdgdesktopportal-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "ec339ae2cb4b599569bd46ad60c9c56d9961513aa3ad8b035f86828d7572141487ee4484b227a55454fc8659f9ce18a5852e75f10fa74b2ad9a22bce9418c50d"

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
