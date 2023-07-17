SUMMARY = "KDE Text editing widgets"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5TextWidgets5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "8f1467f23a988e331df68c3b62d65ca2eecafc51fed3e82a959a382b95c20d96dcc203e6ef227ef31f429a12537c440eabaa8b6a03e60b3d19247d76e17c2417"

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
