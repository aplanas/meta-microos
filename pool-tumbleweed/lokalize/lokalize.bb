SUMMARY = "KDE Translation Editor"
DESCRIPTION = "This package contains lokalize, an editor for translations"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "lokalize-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "df33fa8af1ff9ff063acbcf9c4d52ee148457e94247f245a25221b85e55c379cf5bad98b073fb4f8566a3e9c217338a8b93bbac36b43dfc65533ccf5a3ab42d5"

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
