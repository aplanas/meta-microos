SUMMARY = "Screen Capture Program"
DESCRIPTION = "Spectactle is a screenshot-taking program made by KDE. It allows taking screenshots \
of screens, windows, regions of the screen, and to export them to files or other \
online services."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "spectacle-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "08a55dac9180c548547ca43125e6f1f6e582a31105a5fa350eef0d9b3ea3aae6323040f6067524712aa7711195b9eb17e87a16a218a0cf3f9864c0a5ec083580"

RPROVIDES:${PN} += "application() \
application(org.kde.spectacle.desktop) \
kapture \
kscreengenie \
metainfo() \
metainfo(org.kde.spectacle.appdata.xml) \
spectacle \
spectacle(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Kirigami2.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPipeWireRecord.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
