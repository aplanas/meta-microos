SUMMARY = "Instant Messenger"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kopete-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "726dbf3b6eec41d74ec9eee47d6e01155e0a387d245964a8591873baa1fbae3da60951f57c1362cfd4619a0f155db5ee2a4dc89411d3613b78911d81dfc4ed2d"

RPROVIDES:${PN} += "kopete \
libkopete-oscar.so.1 \
libkopete-otr-shared.so.1 \
libkopete-videodevice.so.1 \
libkopete.so.1 \
libkopeteaddaccountwizard.so.1 \
libkopetechatwindow-shared.so.1 \
libkopetecontactlist.so.1 \
libkopeteidentity.so.1 \
libkopeteprivacy.so.1 \
libkopetestatusmenu.so.1 \
liboscar.so.1 \
libqgroupwise.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5Emoticons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KHtml.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5IdentityManagement.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgadu.so.3 \
libidn.so.12 \
libotr.so.5 \
libphonon4qt5.so.4 \
libqca-qt5.so.2 \
libstdc++.so.6 \
libv4l2.so.0 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1"

inherit rpm
