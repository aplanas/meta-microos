SUMMARY = "KDE WebEngine web browser component"
DESCRIPTION = "This package contains a HTML rendering engine for Konqueror that is based on QtWebEngine."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "webenginepart-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3ecc4d75b9cb209fd2d936f8124a482b6a944295ba81befd31b900a7d45250156ba9c9a2412690ac52c6224f613cfcc5b3a3a0801434df405f02e9c70c02553a"

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
