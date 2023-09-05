SUMMARY = "KDE Character Selector"
DESCRIPTION = "KCharSelect is the KDE character selector tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kcharselect-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2a96d3a90f4d627dc5c2db288c45206a88ed696df09e6fd1354eaa62aa8063adeff421ffbea9cb4fe2c62d0e43f3832b49e3c4f73c302f07e1a871525251cfe4"

RPROVIDES:${PN} += "kcharselect \
kcharselect5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
