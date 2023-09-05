SUMMARY = "KDE Network Libraries"
DESCRIPTION = "Network File Sharing configuration module and plugin. \
Used for configuring Samba shares."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdenetwork-filesharing-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f59e2dff972f219d176922c05942f7bbbc479a25874f03a56bb47bfca648614a9b7d82ba6aa1bc169b5c55d03f9a7c786dcfa60c8cb2fd4eebe7f6d56947d011"

RPROVIDES:${PN} += "kdenetwork-filesharing \
kdenetwork4-filesharing"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpackagekitqt5.so.1 \
libstdc++.so.6"

inherit rpm
