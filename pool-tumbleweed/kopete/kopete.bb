SUMMARY = "Instant Messenger"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kopete-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b1240814a8bdaa3e7e5a9fe87e3734c73e546ac9907f4b3738ae4fbc411cbd5582bad3dd810d837eb3e3e71da62801d193254a66b10ba34e91ff835330cd7f5f"

RPROVIDES:${PN} += "application() \
application(org.kde.kopete.desktop) \
kopete \
kopete(aarch-64) \
libkopete.so.1()(64bit) \
libkopete_oscar.so.1()(64bit) \
libkopete_otr_shared.so.1()(64bit) \
libkopete_videodevice.so.1()(64bit) \
libkopeteaddaccountwizard.so.1()(64bit) \
libkopetechatwindow_shared.so.1()(64bit) \
libkopetecontactlist.so.1()(64bit) \
libkopeteidentity.so.1()(64bit) \
libkopeteprivacy.so.1()(64bit) \
libkopetestatusmenu.so.1()(64bit) \
liboscar.so.1()(64bit) \
libqgroupwise.so()(64bit) \
metainfo() \
metainfo(org.kde.kopete.appdata.xml) \
mimehandler(application/x-icq) \
mimehandler(application/x-kopete-emoticons)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5DNSSD.so.5()(64bit) \
libKF5Emoticons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KDELibs4Support.so.5()(64bit) \
libKF5KHtml.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgadu.so.3()(64bit) \
libidn.so.12()(64bit) \
libidn.so.12(LIBIDN_1.0)(64bit) \
libotr.so.5()(64bit) \
libphonon4qt5.so.4()(64bit) \
libqca-qt5.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libv4l2.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libz.so.1()(64bit)"

inherit rpm
