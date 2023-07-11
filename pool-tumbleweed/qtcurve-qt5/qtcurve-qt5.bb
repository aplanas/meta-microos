SUMMARY = "QtCurve style for Qt 5"
DESCRIPTION = "This package contains the QtCurve style for Qt 5. QtCurve is a set \
of widget styles available for Qt and GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "qtcurve-qt5-1.9.0-6.18.aarch64.rpm"
RPM_HASH = "97634374bac0e0673c2c99561acc027e7f1b8511e9ef5aecc89c4a3f91fc2ebe11297e69ab545c509287d5368ccc94c9a6bfdff65b706c6f2d12b5c8adb670d7"

RPROVIDES:${PN} += "qtcurve-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Style.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libqtcurve-utils.so.2 \
libstdc++.so.6"

inherit rpm
