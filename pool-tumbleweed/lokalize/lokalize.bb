SUMMARY = "KDE Translation Editor"
DESCRIPTION = "This package contains lokalize, an editor for translations"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "lokalize-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fb2f2154a2511aecafc8a16f5304ae550ce319d45521669a3bab4fd331c9b3b71dc227df5214cef2e39f2cc0d72cd015b9cb6730fe3decbffd5227e610582f1d"

RPROVIDES:${PN} += "lokalize \
lokalize5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
