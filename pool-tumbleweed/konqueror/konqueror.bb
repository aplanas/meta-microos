SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "Konqueror allows you to manage your files and browse the web in a \
unified interface."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konqueror-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "dd02b3ef25910e26231edca2186b2e8e7ad76002f5b8753e096131beb3c450ece553fffb3c599f77bc2b25012f38f382082bcff99511082c0b0bd713e9551707"

RPROVIDES:${PN} += "config-konqueror \
kde-baseapps-libkonq \
kde-baseapps5-libkonq \
konqueror \
konqueror-libkonq \
libKF5Konq.so.6 \
libKF5Konq6 \
libkdeinit5-kfmclient.so \
libkdeinit5-konqueror.so \
libkonquerorprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
webenginepart"

inherit rpm
