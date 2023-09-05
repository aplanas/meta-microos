SUMMARY = "Screen Capture Program"
DESCRIPTION = "Spectactle is a screenshot-taking program made by KDE. It allows taking screenshots \
of screens, windows, regions of the screen, and to export them to files or other \
online services."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "spectacle-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e77807603177aba7143b2fa62d96cf0d68c1fa89567955b34e8b75e94c47008ae201be658c15f2d1fb8d5bbfd5c8d1e20890a6f7754815fd2c313e78c63ac72c"

RPROVIDES:${PN} += "kapture \
kscreengenie \
spectacle"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Kirigami2.so.5 \
libKF5Notifications.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPipeWireRecord.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-cursor.so.0 \
libxcb-image.so.0 \
libxcb-util.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
