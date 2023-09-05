SUMMARY = "KDE WebEngine web browser component"
DESCRIPTION = "This package contains a HTML rendering engine for Konqueror that is based on QtWebEngine."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "webenginepart-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5ab639c8dec793b9a29e14e21572f94b1ee5c4765e9a7b294c4236c0f74cbf7576158b456e4483e5f780e969e1e67912e57f66e17dfd8959e4a8d507bdc0cb78"

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
