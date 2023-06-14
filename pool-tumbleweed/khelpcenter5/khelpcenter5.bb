SUMMARY = "KDE Documentation Application"
DESCRIPTION = "Application to show KDE Applications' documentation."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "khelpcenter5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4b250340b27042d99e8f32bdbfa5a892b937ca288d8247d1bfcbddb0a15960103ef2a6a031920263f88ffc6f373d56501ea49ac67e91960e2c2182348bca7dca"

RPROVIDES:${PN} += "khelpcenter5 \
suse-help-viewer"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
kdoctools \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5DocTools.so.5 \
libKF5I18n.so.5 \
libKF5KHtml.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
libxml2.so.2"

inherit rpm
