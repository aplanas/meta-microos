SUMMARY = "KDE Text editing widgets"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5TextWidgets5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8fbdc6e6fbb874ed249572e5396f15d9fe8f4cdb8a02f1f9c152e6f002d15b5cd7edd6a94769fb3772fa655b8c1ade3bf9066ff48cf780a2db2e93be38eb1d4a"

RPROVIDES:${PN} += "libKF5TextWidgets.so.5 \
libKF5TextWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
