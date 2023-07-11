SUMMARY = "KDE WebEngine web browser component"
DESCRIPTION = "This package contains a HTML rendering engine for Konqueror that is based on QtWebEngine."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "webenginepart-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2cbe6195c02f6501728f03730c9e11c83e4cf91a18dccbf24b48a52dfa5ec0fca583d6d1b569ac89d22611d93c9f34bd8be0201446e3c53d76ac35076710c904"

RPROVIDES:${PN} += "libkwebenginepart.so \
webenginepart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Konq.so.6 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
