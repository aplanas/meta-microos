SUMMARY = "Qt 5 Quick Controls Addon"
DESCRIPTION = "The Qt Quick Controls2 module provides a set of controls that \
can be used to build complete interfaces in Qt Quick."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtquickcontrols2-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "4d6eee66f900b923510ff14746dfcf1e742c4f72464f9a79eb2c273caf9fbeae8b64d932d41fd8fa925013c9c3dbbf1075f718dae9aafa65c21580c5d36e1b10"

RPROVIDES:${PN} += "libqqc2materialstyleplugin.so \
libqt5-qtquickcontrols2 \
libqtlabscalendarplugin.so \
libqtlabsplatformplugin.so \
libqtquickcontrols2fusionstyleplugin.so \
libqtquickcontrols2imaginestyleplugin.so \
libqtquickcontrols2plugin.so \
libqtquickcontrols2universalstyleplugin.so \
libqtquicktemplates2plugin.so \
qt5qmlimport-Qt.labs.calendar.1 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Fusion.2 \
qt5qmlimport-QtQuick.Controls.Fusion.impl.2 \
qt5qmlimport-QtQuick.Controls.Imagine.2 \
qt5qmlimport-QtQuick.Controls.Imagine.impl.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Material.impl.2 \
qt5qmlimport-QtQuick.Controls.Universal.2 \
qt5qmlimport-QtQuick.Controls.Universal.impl.2 \
qt5qmlimport-QtQuick.Controls.impl.2 \
qt5qmlimport-QtQuick.Templates.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5QuickTemplates2.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQtQuick5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.calendar.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Fusion.2 \
qt5qmlimport-QtQuick.Controls.Imagine.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Universal.2 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
