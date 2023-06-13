SUMMARY = "Tools to monitor SMART devices and MDRaid health status"
DESCRIPTION = "Tools to monitor SMART devices and MDRaid health status. \
Features a full application and a Plasma applet. \
 \
Application: \
 \
- Display S.M.A.R.T. attributes for harddrives supporting it. \
- Start and monitor progress of S.M.A.R.T. Short and Extended self test. \
- Display properties for MDRaid arrays. \
- Start and monitor progress of data scrubbing on MDRaid arrays. \
 \
Applet: \
 \
- Display basic health status for storage units. \
- Can be used on the desktop, on a panel or as a systray icon (see systray settings to activate). \
- Use KDE notification for health status change. \
- Highly configurable interface."
LICENSE = "GPL-2.0-only"

PV = "0.3.4"

RPM_NAME = "diskmonitor-0.3.4-3.8.aarch64.rpm"
RPM_HASH = "a7901b9ad6c456a003bc483970b11ef4b496834d74586a529c8e4de50b275d8bb3c5d460546636afd6fb634d964b3adc9b9268a417ac99e418ebba246a2b37d4"

RPROVIDES:${PN} += "application() \
application(diskmonitor.desktop) \
diskmonitor \
diskmonitor(aarch-64) \
libdiskmonitor_qmlplugins.so()(64bit) \
metainfo() \
metainfo(org.papylhomme.diskmonitor.appdata.xml) \
qt5qmlimport(org.papylhomme.diskmonitor.0)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.configuration.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
qt5qmlimport(org.kde.plasma.platformcomponents.2) \
qt5qmlimport(org.papylhomme.diskmonitor.0) \
udisks2"

inherit rpm
