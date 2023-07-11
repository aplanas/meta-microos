SUMMARY = "Plasma QML components"
DESCRIPTION = "Plasma QML and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "plasma-framework-components-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "e7bdd972a14e07e6b9171a9aa1323963316d70097e1b816bf69845093781e1056023d09286506e280cf0b320b4127a4aab20ea7c314cf3dc79fbb0fff02dc1b8"

RPROVIDES:${PN} += "libcalendarplugin.so \
libcorebindingsplugin.so \
libplasmacomponentsplugin.so \
libplasmaextracomponentsplugin.so \
libplatformcomponentsplugin.so \
plasma-framework-components \
qt5qmlimport-QtQuick.Controls.Styles.Plasma.1 \
qt5qmlimport-QtQuick.Controls.Styles.Plasma.2 \
qt5qmlimport-org.kde.plasma.calendar.1 \
qt5qmlimport-org.kde.plasma.calendar.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.1 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.platformcomponents.2"

RDEPENDS:${PN} += "kdeclarative-components \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libGLX.so.0 \
libKF5CalendarEvents.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Plasma.so.5 \
libKF5PlasmaQuick.so.5 \
libKF5QuickAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-render.so.0 \
libxcb.so.1 \
plasma-framework \
plasma-framework-private \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Controls.Styles.Plasma.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kconfig.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.calendar.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
