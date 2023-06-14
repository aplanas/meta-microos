SUMMARY = "KDE Network Libraries"
DESCRIPTION = "Network File Sharing configuration module and plugin. \
Used for configuring Samba shares."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdenetwork-filesharing-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ee5873ad0c7a5fa91e8e66d62e120710c1fc90c959d806c427b768a14f3e7681b5a91ff8085fac5894d17990b294d6a168e3eb120ee5332bca919b41bce3b2c5"

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
