SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "Konqueror allows you to manage your files and browse the web in a \
unified interface."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konqueror-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fb2738d4209e141cbeac1c8e8370f5c5d691baa3ee975b448d08849a2d247975cfbf9acb1029a289cf45e6c51343929f72ad20a32790437c4f282bcf46cb8f7f"

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
libKF5Activities.so.5 \
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
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
webenginepart"

inherit rpm
