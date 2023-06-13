SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "KDE Accounts Providers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kaccounts-providers-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0f38be09e8eef194d18789c83d5d321b9e0a6fed042bf525633e37b4360c70ecae6e410cf4e8967258e06020d9a8f3bdf31018163ec326307f335323fea18bc9"

RPROVIDES:${PN} += "kaccounts-providers \
kaccounts-providers(aarch-64) \
metainfo() \
metainfo(org.kde.kaccounts.nextcloud.appdata.xml) \
metainfo(org.kde.kaccounts.owncloud.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libkaccounts.so.2()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtWebEngine.1) \
qt5qmlimport(org.kde.kirigami.2) \
signon-plugin-oauth2"

inherit rpm
