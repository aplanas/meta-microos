SUMMARY = "Version control plugins for Dolphin"
DESCRIPTION = "Dolphin file manager specific version control plugins that: \
- Show the version state of a file by an emblem + color \
- Provide a context menu with version control specific actions"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dolphin-plugins-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c3eb041ae2ee37587e610f718734f90c08d922471436ff921a5b51d216f6d2252c453c6bdaa2d548c4dcda1ab65066c048580aaef922215c00c597cd203f033e"

RPROVIDES:${PN} += "dolphin-plugins"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdolphinvcs.so.5 \
libstdc++.so.6"

inherit rpm
