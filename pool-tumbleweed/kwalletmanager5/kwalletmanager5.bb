SUMMARY = "Wallet Management Tool"
DESCRIPTION = "This application allows you to manage your KDE password wallet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwalletmanager5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6bd85af039fc5be5c71897d339d038ab65965afcca476d76d0523b1f3f56e024994e62056321f497f2bf9af11f9864a0a026890b330705fc01216e3da70cc3a3"

RPROVIDES:${PN} += "kwalletmanager \
kwalletmanager5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5AuthCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
