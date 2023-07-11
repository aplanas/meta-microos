SUMMARY = "Download Manager"
DESCRIPTION = "An advanced download manager by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kget-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e2286309bcd4b5cd26a775fffe161e2eb519ff2c98b46deed7d2c30276ea22715533ed97b75ecb8afed54fd9d20f6a3c401097c8eb20c065d8c69b48c5286b32"

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
