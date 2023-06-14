SUMMARY = "Perf GUI for performance analysis"
DESCRIPTION = "Hotspot is a standalone GUI for performance data with an UI like KCachegrind \
around Linux perf."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "hotspot-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "83b6a3563204cc2d135e54e4811a8b7b9eede9dbb9b1a8fcd9f3d0bc0e8983191a0930a034be2c9060621c26fbd442a5ca0dc3303936160a74afde4661dc8251"

RPROVIDES:${PN} += "hotspot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Solid.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libkddockwidgets.so.1.7 \
libm.so.6 \
libqcustomplot.so.2 \
libstdc++.so.6 \
libzstd.so.1 \
perf"

inherit rpm
