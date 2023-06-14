SUMMARY = "Widgets for configuration dialogs"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ConfigWidgets5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7ffe4bee6157d7206564c68ba1885692c3d0b7dee7a220b892fea2702e21cb66105b1ea954a1e07a4248dfe6a22596db6b4745bea9d448bd1543295257a7c597"

RPROVIDES:${PN} += "libKF5ConfigWidgets.so.5 \
libKF5ConfigWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
