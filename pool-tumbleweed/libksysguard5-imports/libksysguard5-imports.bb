SUMMARY = "Task management and system monitoring library -- QML bindings"
DESCRIPTION = "This package provides QtQuick bindings for libksysguard, allowing its use in \
QML applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libksysguard5-imports-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "0ef9747884da6a6ee1dfe65e4f9e50052ed1a2bbcd3a4538b0caadf54d420d244f32d5c31ecbd1e8b6e7cc3885e4c60ca6e441fce96f250016f1707ba1d42e6b"

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
