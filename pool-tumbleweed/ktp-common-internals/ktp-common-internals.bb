SUMMARY = "Telepathy common module"
DESCRIPTION = "ktp-common-internals is the base library for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-common-internals-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d138241345179201486409bd4a898f8b20813092496c4b315f5890be5353ea1353c9de228c60f9137f973524c9645fa438b4ca41b6ea0178718bbceaaa63c86d"

RPROVIDES:${PN} += "ktp-common-internals \
ktp-common-internals5 \
libKTpCommonInternals.so.9 \
libKTpLogger.so.9 \
libKTpModels.so.9 \
libKTpOTR.so.9 \
libKTpWidgets.so.9 \
libktpcommoninternals6 \
libktpcommoninternals7 \
libktpcommoninternals8 \
libktpqmlplugin.so \
qt5qmlimport-org.kde.telepathy.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ktp-icons \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KCMUtils.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5People.so.5 \
libKF5PeopleBackend.so.5 \
libKF5PeopleWidgets.so.5 \
libKF5Service.so.5 \
libKF5TextEditor.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libkaccounts.so.2 \
libotr.so.5 \
libsignon-qt5.so.1 \
libstdc++.so.6 \
libtelepathy-logger-qt.so.5 \
libtelepathy-qt5-service.so.1 \
libtelepathy-qt5.so.0 \
telepathy-accounts-signon"

inherit rpm
