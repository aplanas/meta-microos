SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "KDE Accounts Providers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kaccounts-providers-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "34b227d0326da8530c43fc4d8f04fce7667dae24835b6e9e5736222af9ed293a227e93d08324726332860eba1d0635618102ed74cf8f4cd3dc5500170200b039"

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
