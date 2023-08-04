SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Plasma Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "GPL-2.0+"

PV = "5.27.7"

RPM_NAME = "plasma5-integration-plugin-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a4192075ddf57c4be387bd131d758e19e0a630b5b87c4fec774a211a48149103a0bb3685d89f5ded693469db75b9529d6c6d1617b5cdb8aafe49886c1b270f7b"

RPROVIDES:${PN} += "plasma5-integration-plugin"

RDEPENDS:${PN} += "/usr/bin/perl \
hack-fonts \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libXcursor.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1 \
noto-sans"

inherit rpm
