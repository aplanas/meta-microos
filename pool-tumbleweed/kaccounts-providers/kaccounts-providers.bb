SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "KDE Accounts Providers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kaccounts-providers-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0f38be09e8eef194d18789c83d5d321b9e0a6fed042bf525633e37b4360c70ecae6e410cf4e8967258e06020d9a8f3bdf31018163ec326307f335323fea18bc9"

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
