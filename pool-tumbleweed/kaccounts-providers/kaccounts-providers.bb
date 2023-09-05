SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "KDE Accounts Providers."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kaccounts-providers-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "818febf73a22dcb37ad835577a1fbf76d0bbb31c16026535e050f4159c2f46dd54ee2dcd03c8086a2ccd9a97ec27638438a1389bbb9a74f0edf76ddb1b77c623"

RPROVIDES:${PN} += "kaccounts-providers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libkaccounts.so.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-org.kde.kirigami.2 \
signon-plugin-oauth2"

inherit rpm
