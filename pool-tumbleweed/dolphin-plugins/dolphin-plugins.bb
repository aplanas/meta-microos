SUMMARY = "Version control plugins for Dolphin"
DESCRIPTION = "Dolphin file manager specific version control plugins that: \
- Show the version state of a file by an emblem + color \
- Provide a context menu with version control specific actions"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "dolphin-plugins-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2335458d33464532922b1d3621c18cd5428ee0ad005c1e7063b81969b97b60aa3eec71a3e7fd137526da03168bee98fc3ac8d450f1bcb31e52eabfb68af3173e"

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
