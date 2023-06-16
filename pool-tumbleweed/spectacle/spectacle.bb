SUMMARY = "Screen Capture Program"
DESCRIPTION = "Spectactle is a screenshot-taking program made by KDE. It allows taking screenshots \
of screens, windows, regions of the screen, and to export them to files or other \
online services."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "spectacle-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "08a55dac9180c548547ca43125e6f1f6e582a31105a5fa350eef0d9b3ea3aae6323040f6067524712aa7711195b9eb17e87a16a218a0cf3f9864c0a5ec083580"

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
