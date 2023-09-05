SUMMARY = "Library for Mahjongg tiles"
DESCRIPTION = "This package contains the library for Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5KMahjongglib5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7e39066a43d31551a2c6bafff07aa772e0a8e17682d152facc1e9f3e9f12e8d00ddc142a517f5765d44660e3522e917a2a1d7dc3bff4d50ad73d3cf5b7a5e7c4"

RPROVIDES:${PN} += "libKF5KMahjongglib.so.5 \
libKF5KMahjongglib5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkmahjongg \
libstdc++.so.6"

inherit rpm
