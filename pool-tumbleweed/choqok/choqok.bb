SUMMARY = "Micro-Blogging Client for KDE"
DESCRIPTION = "A micro-blogging client for the K Desktop Environment. \
The name comes from an ancient Persian word which means Sparrow. \
It currently supports twitter.com and identi.ca services."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "choqok-1.7.0-3.10.aarch64.rpm"
RPM_HASH = "778546b247cb2d6fd6650f0c03debd0b41d8b5128be29d6520ccfb22469ddca45a729637e22e2ae7a4f43cf0b94b7406cbac15726b86a41e5f6ee41cee480b24"

RPROVIDES:${PN} += "application() \
application(org.kde.choqok.desktop) \
choqok \
choqok(aarch-64) \
libchoqok.so.1()(64bit) \
libgnusocialapihelper.so.1()(64bit) \
libtwitterapihelper.so.1()(64bit) \
metainfo() \
metainfo(org.kde.choqok.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Attica.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Emoticons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtelepathy-qt5.so.0()(64bit)"

inherit rpm
