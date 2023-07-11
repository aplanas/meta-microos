SUMMARY = "KDE Character Selector"
DESCRIPTION = "KCharSelect is the KDE character selector tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kcharselect-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "996c65e8adcd4813fdc4ebec5272c721c42779da7fd54a2c862da70905219d2b5e0eb9fa19963bb10e2f5e6b67c8dd8c74b3b7a5cd6f5d803469056e1c23f9a6"

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
