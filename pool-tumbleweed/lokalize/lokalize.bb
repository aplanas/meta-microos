SUMMARY = "KDE Translation Editor"
DESCRIPTION = "This package contains lokalize, an editor for translations"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "lokalize-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "23fe9339504c29a9fe7b6ecfded1871e14386ec0a86428a181434c70231483b7d1159bee25824706eb315ef384e0f1c136549db84876283ab65849dd12e13fa6"

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
