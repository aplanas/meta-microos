SUMMARY = "KDE Network Libraries"
DESCRIPTION = "Network File Sharing configuration module and plugin. \
Used for configuring Samba shares."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdenetwork-filesharing-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ee5873ad0c7a5fa91e8e66d62e120710c1fc90c959d806c427b768a14f3e7681b5a91ff8085fac5894d17990b294d6a168e3eb120ee5332bca919b41bce3b2c5"

RPROVIDES:${PN} += "kdenetwork-filesharing \
kdenetwork-filesharing(aarch-64) \
kdenetwork4-filesharing \
metainfo() \
metainfo(org.kde.kdenetwork-filesharing.metainfo.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libpackagekitqt5.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
