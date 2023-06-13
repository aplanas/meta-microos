SUMMARY = "KDE BitTorrent Client"
DESCRIPTION = "KTorrent is a BitTorrent application by KDE which allows you to download files \
using the BitTorrent protocol. It enables you to run multiple torrents at the \
same time and comes with extended features to make it a full-featured client \
for BitTorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktorrent-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ba6ced72f3399ce43d6fc67551926243d1d451e9e06b4435aa309470f9f99cdaa4724fc0025998e3e325efe0cb97534555fc94bbd76902d25889d5da79457f4e"

RPROVIDES:${PN} += "application() \
application(org.kde.ktorrent.desktop) \
ktorrent \
ktorrent(aarch-64) \
libktcore.so.16()(64bit) \
metainfo() \
metainfo(org.kde.ktorrent.appdata.xml) \
mimehandler(application/x-bittorrent) \
mimehandler(application/x-torrent) \
mimehandler(x-scheme-handler/magnet)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5DNSSD.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Plotting.so.5()(64bit) \
libKF5Syndication.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Torrent.so.6()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkworkspace5.so.5()(64bit) \
libm.so.6()(64bit) \
libphonon4qt5.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libtag.so.1()(64bit)"

inherit rpm
