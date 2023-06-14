SUMMARY = "KDE Text editing widgets"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5TextWidgets5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "6b444ae29caf73a8759afca1a1f6ab96f5a819b8eaff0621e4999dce47ab21d43ba6f35712c8dc2a33a0455fa0e8bc123094306b1162bac9d24434092e9db385"

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
