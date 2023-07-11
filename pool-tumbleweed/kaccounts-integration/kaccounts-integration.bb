SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kaccounts-integration-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2c22c2f3946292695152dff15dccf840cf3afc37b782d461e1e1d6bee0456b698691b10407657eb3134dc2df2f431a8bbf231a852570bd928f85d23710a97de5"

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
