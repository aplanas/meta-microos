SUMMARY = "Qt 5 Quick Controls Addon"
DESCRIPTION = "The Qt Quick Controls2 module provides a set of controls that \
can be used to build complete interfaces in Qt Quick."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtquickcontrols2-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "4d6eee66f900b923510ff14746dfcf1e742c4f72464f9a79eb2c273caf9fbeae8b64d932d41fd8fa925013c9c3dbbf1075f718dae9aafa65c21580c5d36e1b10"

RPROVIDES:${PN} += "libqqc2materialstyleplugin.so()(64bit) \
libqt5-qtquickcontrols2 \
libqt5-qtquickcontrols2(aarch-64) \
libqtlabscalendarplugin.so()(64bit) \
libqtlabsplatformplugin.so()(64bit) \
libqtquickcontrols2fusionstyleplugin.so()(64bit) \
libqtquickcontrols2imaginestyleplugin.so()(64bit) \
libqtquickcontrols2plugin.so()(64bit) \
libqtquickcontrols2universalstyleplugin.so()(64bit) \
libqtquicktemplates2plugin.so()(64bit) \
qt5qmlimport(Qt.labs.calendar.1) \
qt5qmlimport(Qt.labs.platform.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Fusion.2) \
qt5qmlimport(QtQuick.Controls.Fusion.impl.2) \
qt5qmlimport(QtQuick.Controls.Imagine.2) \
qt5qmlimport(QtQuick.Controls.Imagine.impl.2) \
qt5qmlimport(QtQuick.Controls.Material.2) \
qt5qmlimport(QtQuick.Controls.Material.impl.2) \
qt5qmlimport(QtQuick.Controls.Universal.2) \
qt5qmlimport(QtQuick.Controls.Universal.impl.2) \
qt5qmlimport(QtQuick.Controls.impl.2) \
qt5qmlimport(QtQuick.Templates.2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5QuickTemplates2.so.5()(64bit) \
libQt5QuickTemplates2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets5 \
libQtQuick5 \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(Qt.labs.calendar.1) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Fusion.2) \
qt5qmlimport(QtQuick.Controls.Imagine.2) \
qt5qmlimport(QtQuick.Controls.Material.2) \
qt5qmlimport(QtQuick.Controls.Universal.2) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
