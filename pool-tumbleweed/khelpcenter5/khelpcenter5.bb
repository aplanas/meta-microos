SUMMARY = "KDE Documentation Application"
DESCRIPTION = "Application to show KDE Applications' documentation."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "khelpcenter5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5077185141bdd1dd6674dbe2b6a4de6ebc0b34dc6d978bd4fccb48e045d44ee2b7d22c0dec4fd949ed77065b49e52712d8d813a0d337163dda22947911075b04"

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
