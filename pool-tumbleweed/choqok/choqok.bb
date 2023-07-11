SUMMARY = "Micro-Blogging Client for KDE"
DESCRIPTION = "A micro-blogging client for the K Desktop Environment. \
The name comes from an ancient Persian word which means Sparrow. \
It currently supports twitter.com and identi.ca services."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "choqok-1.7.0-3.11.aarch64.rpm"
RPM_HASH = "a065c2ef46656015b4b108e35d11769d4be261d8e4ee5b6c8f1eee776dd05fad64ff7371dd33097d12ac08f68da63e18b3d0d89714397b504b9c0489f7e73822"

RPROVIDES:${PN} += "choqok \
libchoqok.so.1 \
libgnusocialapihelper.so.1 \
libtwitterapihelper.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Attica.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Emoticons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Purpose.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5NetworkAuth.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
