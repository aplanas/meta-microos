SUMMARY = "Additional KIO slaves for KDE applications"
DESCRIPTION = "Additional KIO-slaves for KDE applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kio-extras5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e1ad9aef9e3e05c70317b69872fc68e4151158b6f9c494768bfc9cc4dcfd0bfcacd7ea1a045a2eab93ee2451ba4809c24afcad1fb7fcf9badbc280f722005db4"

RPROVIDES:${PN} += "kde-odf-thumbnail \
kfileaudiopreview \
kio-extras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ActivitiesStats.so.1 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KExiv2.so.15.0.0 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5SyntaxHighlighting.so.5 \
libOpenEXR-3-1.so.30 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libimobiledevice-1.0.so.6 \
libkdsoap.so.2 \
libkioarchive.so.5 \
libmtp.so.9 \
libphonon4qt5.so.4 \
libplist-2.0.so.4 \
libsmbclient.so.0 \
libssh.so.4 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
