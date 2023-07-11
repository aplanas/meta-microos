SUMMARY = "KDE BitTorrent Client"
DESCRIPTION = "KTorrent is a BitTorrent application by KDE which allows you to download files \
using the BitTorrent protocol. It enables you to run multiple torrents at the \
same time and comes with extended features to make it a full-featured client \
for BitTorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktorrent-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8568280cf425aab72d853fea5b2dfbe0be49199d7894b6de644e2c4608250927a56ce2d331fb3af005d164c060dfc85a0d7696c32d23b51dd0a74dc5081327f6"

RPROVIDES:${PN} += "ktorrent \
libktcore.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Plotting.so.5 \
libKF5Syndication.so.5 \
libKF5TextWidgets.so.5 \
libKF5Torrent.so.6 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkworkspace5.so.5 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
