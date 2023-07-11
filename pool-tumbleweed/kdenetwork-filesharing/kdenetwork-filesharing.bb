SUMMARY = "KDE Network Libraries"
DESCRIPTION = "Network File Sharing configuration module and plugin. \
Used for configuring Samba shares."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdenetwork-filesharing-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b579884d767a953ed6b8b969878df1d3c022cce7bc0b2cced514ab6168161bb6d97561d019a6cf753aac9998cda05e22da10175c18956ae2e97dc555f7074fc4"

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
