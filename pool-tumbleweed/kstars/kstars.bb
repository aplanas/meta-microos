SUMMARY = "Desktop Planetarium"
DESCRIPTION = "KStars is astronomy software. It provides an accurate graphical \
simulation of the night sky, for any time and location on Earth."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.6.4"

RPM_NAME = "kstars-3.6.4-1.1.aarch64.rpm"
RPM_HASH = "217ee7f7fa8902f1d2c49d00cdd11540fe1031be136b94775bc4fdc0bd74e66cf4da3b9c1a4b8100179edd976f7dace4eee70a07ef5d8af59caf6caad31b5a8f"

RPROVIDES:${PN} += "kstars"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Plotting.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libXISF.so.0 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgsl.so.27 \
libindiclient.so.2 \
libm.so.6 \
libnova-0.15.so.0 \
libqt5-qtquickcontrols \
libqt5keychain.so.1 \
libraw.so.23 \
libstdc++.so.6 \
libstellarsolver.so.2 \
libwcs.so.7 \
libz.so.1 \
qt5qmlimport-Qt.labs.calendar.1 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtPositioning.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Universal.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
