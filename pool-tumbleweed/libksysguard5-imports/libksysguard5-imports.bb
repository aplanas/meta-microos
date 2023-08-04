SUMMARY = "Task management and system monitoring library -- QML bindings"
DESCRIPTION = "This package provides QtQuick bindings for libksysguard, allowing its use in \
QML applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libksysguard5-imports-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a265c1877dd150881d9f80e3a9730e9c31fded2c8fb8d1641794590353fa6dd6f0b1ef223b76947627b3ea4f04a2bd0270a4b94a55f6699eb718b5d03dbc86be"

RPROVIDES:${PN} += "libFacesPlugin.so \
libFormatterPlugin.so \
libProcessPlugin.so \
libSensorsPlugin.so \
libksysguard5-imports \
qt5qmlimport-org.kde.ksysguard.faces.1 \
qt5qmlimport-org.kde.ksysguard.faces.private.1 \
qt5qmlimport-org.kde.ksysguard.formatter.1 \
qt5qmlimport-org.kde.ksysguard.process.1 \
qt5qmlimport-org.kde.ksysguard.sensors.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigQml.so.5 \
libKSysGuardFormatter.so.1 \
libKSysGuardSensorFaces.so.1 \
libKSysGuardSensors.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libksysguard5 \
libprocesscore.so.9 \
libstdc++.so.6 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.ksysguard.faces.1 \
qt5qmlimport-org.kde.ksysguard.faces.private.1 \
qt5qmlimport-org.kde.ksysguard.formatter.1 \
qt5qmlimport-org.kde.ksysguard.sensors.1 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

inherit rpm
