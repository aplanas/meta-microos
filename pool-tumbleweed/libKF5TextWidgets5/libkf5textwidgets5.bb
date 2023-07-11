SUMMARY = "KDE Text editing widgets"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5TextWidgets5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2d64f634556f0ee03bc64beec2fd04a863ec488a5cec2712347b5884c7e02d0db4a5c80a1d8cfad9b2244acff0fcf15712f150c7221ccf12fe7634f57ffc60b7"

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
