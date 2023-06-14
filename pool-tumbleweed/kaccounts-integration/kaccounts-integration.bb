SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kaccounts-integration-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f3559e1edbc88b1a9fbc0456cae29756fc66e2fdf880219d01ea039bb0a99deeda865289991f747da04d27685329f3a6e02e9da33a897b0fc974e69d3085f586"

RPROVIDES:${PN} += "kaccounts-integration \
libkaccountsdeclarativeplugin.so \
qt5qmlimport-org.kde.kaccounts.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5KIOCore.so.5 \
libKF5QuickAddons.so.5 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libkaccounts.so.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kaccounts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
