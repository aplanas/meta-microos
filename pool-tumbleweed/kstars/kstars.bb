SUMMARY = "Desktop Planetarium"
DESCRIPTION = "KStars is astronomy software. It provides an accurate graphical \
simulation of the night sky, for any time and location on Earth."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.6.4"

RPM_NAME = "kstars-3.6.4-1.1.aarch64.rpm"
RPM_HASH = "217ee7f7fa8902f1d2c49d00cdd11540fe1031be136b94775bc4fdc0bd74e66cf4da3b9c1a4b8100179edd976f7dace4eee70a07ef5d8af59caf6caad31b5a8f"

RPROVIDES:${PN} += "application() \
application(org.kde.kstars.desktop) \
kstars \
kstars(aarch-64) \
metainfo() \
metainfo(org.kde.kstars.appdata.xml) \
mimehandler(image/fits)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Plotting.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DataVisualization.so.5()(64bit) \
libQt5DataVisualization.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libXISF.so.0()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgsl.so.27()(64bit) \
libindiclient.so.2()(64bit) \
libm.so.6()(64bit) \
libnova-0.15.so.0()(64bit) \
libqt5-qtquickcontrols \
libqt5keychain.so.1()(64bit) \
libraw.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libstellarsolver.so.2()(64bit) \
libwcs.so.7()(64bit) \
libz.so.1()(64bit) \
qt5qmlimport(Qt.labs.calendar.1) \
qt5qmlimport(Qt.labs.settings.1) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtPositioning.5) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Material.2) \
qt5qmlimport(QtQuick.Controls.Private.1) \
qt5qmlimport(QtQuick.Controls.Universal.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
