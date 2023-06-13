SUMMARY = "Wallet Management Tool"
DESCRIPTION = "This application allows you to manage your KDE password wallet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwalletmanager5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6bd85af039fc5be5c71897d339d038ab65965afcca476d76d0523b1f3f56e024994e62056321f497f2bf9af11f9864a0a026890b330705fc01216e3da70cc3a3"

RPROVIDES:${PN} += "application() \
application(kwalletmanager5-kwalletd.desktop) \
application(org.kde.kwalletmanager5.desktop) \
kwalletmanager \
kwalletmanager5 \
kwalletmanager5(aarch-64) \
metainfo() \
metainfo(org.kde.kwalletmanager5.appdata.xml) \
mimehandler(application/x-kwallet)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
