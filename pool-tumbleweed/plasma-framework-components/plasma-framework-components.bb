SUMMARY = "Plasma QML components"
DESCRIPTION = "Plasma QML and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "plasma-framework-components-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "e19471c14694810f67f175cacb46583f68f49df83be28f7eb4967a6c096df0ae49704e8684af5b9c5e751d2d9d20e5f108bb8dac2c6af13c76e7d8183be0db9b"

RPROVIDES:${PN} += "libcalendarplugin.so()(64bit) \
libcorebindingsplugin.so()(64bit) \
libplasmacomponentsplugin.so()(64bit) \
libplasmaextracomponentsplugin.so()(64bit) \
libplatformcomponentsplugin.so()(64bit) \
plasma-framework-components \
plasma-framework-components(aarch-64) \
qt5qmlimport(QtQuick.Controls.Styles.Plasma.1) \
qt5qmlimport(QtQuick.Controls.Styles.Plasma.2) \
qt5qmlimport(org.kde.plasma.calendar.1) \
qt5qmlimport(org.kde.plasma.calendar.2) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.1) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.platformcomponents.2)"

RDEPENDS:${PN} += "kdeclarative-components \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libGLX.so.0()(64bit) \
libKF5CalendarEvents.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5PlasmaQuick.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-damage.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb.so.1()(64bit) \
plasma-framework \
plasma-framework-private \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Private.1) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Controls.Styles.Plasma.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.kconfig.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.calendar.2) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
