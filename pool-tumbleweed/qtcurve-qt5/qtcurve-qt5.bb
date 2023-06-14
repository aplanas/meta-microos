SUMMARY = "QtCurve style for Qt 5"
DESCRIPTION = "This package contains the QtCurve style for Qt 5. QtCurve is a set \
of widget styles available for Qt and GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "qtcurve-qt5-1.9.0-6.16.aarch64.rpm"
RPM_HASH = "774cc909776ca502233fa7ca8cd3107038b80bfcf309e1f687e58739a729349d70c93a9d92b555b6d5da16aab93bcd1a2d599a9b6c2ee2fabcf8a9fafe475f25"

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
