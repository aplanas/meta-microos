SUMMARY = "Instant Messenger"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kopete-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b1240814a8bdaa3e7e5a9fe87e3734c73e546ac9907f4b3738ae4fbc411cbd5582bad3dd810d837eb3e3e71da62801d193254a66b10ba34e91ff835330cd7f5f"

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

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
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
