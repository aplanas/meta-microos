SUMMARY = "KDE Text Editor"
DESCRIPTION = "KWrite is a text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwrite-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5bf301c329dbdc775990c3208ddf18e3cb3bb5566db999c1d8f8be17d07129fc5a9245b8331c7cd798913c7f6772240d246187224f3f5ba7fc9b02462f619f48"

RPROVIDES:${PN} += "application() \
application(org.kde.kwrite.desktop) \
kwrite \
kwrite(aarch-64) \
metainfo() \
metainfo(org.kde.kwrite.appdata.xml) \
mimehandler(text/plain)"

RDEPENDS:${PN} += "kate-plugins \
ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libkateprivate.so.23.04.1()(64bit)"

inherit rpm
