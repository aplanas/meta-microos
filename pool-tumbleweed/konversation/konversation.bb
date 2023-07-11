SUMMARY = "A graphical IRC client by KDE"
DESCRIPTION = "Konversation is an Internet Relay Chat (IRC) client built on the \
KDE Platform. \
 \
Features: \
 \
 SSL server support \
 Bookmarking support \
 Multiple servers and channels in one single window \
 DCC file transfer \
 Multiple identities for different servers \
 Text decorations and colors \
 OnScreen Display for notifications \
 Automatic UTF-8 detection \
 Per channel encoding support \
 Theme support for nick icons"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konversation-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "66ba8bb5579762614d6b401da844751a175bfb730ccba0ddcfdd024caded3ef251e3a48bbfef5341a7661f81f6473a3fedfdd522b3f950ddb2da0ac36c1f7d35"

RPROVIDES:${PN} += "konversation"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
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
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
