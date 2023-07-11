SUMMARY = "Library for Mahjongg tiles"
DESCRIPTION = "This package contains the library for Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKF5KMahjongglib5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f4a37d87ae14844ea0dfd56c853eabadeec327e5d5f17d2b3d8b5f79e9f1072f530af9e94a224dee53dbca2e43766678aa26703c33522bcb548cc54673f8911f"

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
