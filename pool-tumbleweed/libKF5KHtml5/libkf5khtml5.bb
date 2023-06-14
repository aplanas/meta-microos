SUMMARY = "HTML rendering engine"
DESCRIPTION = "KHTML is a web rendering engine, based on the KParts \
technology and using KJS for JavaScript support."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5KHtml5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1c7c44981a8e8882e3b6afe14766ffe1e87896285c4b514b73e8658fcdebb036d58199dcc9025d28e50e7d5e05e371cd57e1763bb841d7c84d98d0179fffcb39"

RPROVIDES:${PN} += "config-libKF5KHtml5 \
libKF5KHtml.so.5 \
libKF5KHtml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JS.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libphonon4qt5.so.4 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
