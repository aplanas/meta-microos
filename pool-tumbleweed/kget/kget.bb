SUMMARY = "Download Manager"
DESCRIPTION = "An advanced download manager by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kget-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8f25e810b29ee000e2583ffde7835ceaefdf5cab6f2d7ec5870f7957b15acbbb6d15b68ec5ca92b68d2bd248add09e72d1e9c79be7de06f463ca6e2671e49c9b"

RPROVIDES:${PN} += "kget \
kget5 \
libkgetcore.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5I18nLocaleData.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Torrent.so.6 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libkworkspace5.so.5 \
libm.so.6 \
libqca-qt5.so.2 \
libqgpgme.so.15 \
libstdc++.so.6"

inherit rpm
