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

RPM_NAME = "diskmonitor-0.3.4-3.9.aarch64.rpm"
RPM_HASH = "33d539b6280720952b9957b7e91d1c56b0d5729bbb43c6bc90b4dca74cda76268696391faa1bb53af40f190c8ea31be0656afbee5ba8419ced96f97f2eaca331"

RPROVIDES:${PN} += "diskmonitor \
libdiskmonitor-qmlplugins.so \
qt5qmlimport-org.papylhomme.diskmonitor.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.platformcomponents.2 \
qt5qmlimport-org.papylhomme.diskmonitor.0 \
udisks2"

inherit rpm
