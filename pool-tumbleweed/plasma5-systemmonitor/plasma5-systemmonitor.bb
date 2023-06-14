SUMMARY = "An application for monitoring system resources"
DESCRIPTION = "plasma-systemmonitor provides an interface for monitoring system sensors, \
process information and other system resources."
LICENSE = "GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-systemmonitor-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "db5358d419825f45c03a38dd274082d18091d6b8323c24013829858d87764f5e318806d4d85ce0bbd523c217fe6b61fdddfe779854eee04f7940dd74e276872a"

RPROVIDES:${PN} += "libPagePlugin.so \
libTablePlugin.so \
plasma5-systemmonitor \
qt5qmlimport-org.kde.ksysguard.page.1 \
qt5qmlimport-org.kde.ksysguard.table.1"

RDEPENDS:${PN} += "kdeclarative-components \
kirigami2 \
kitemmodels-imports \
knewstuff-imports \
kquickcharts \
ksystemstats5 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5KIOGui.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Service.so.5 \
libKF5WindowSystem.so.5 \
libKSysGuardSensorFaces.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qqc2-desktop-style \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.ksysguard.faces.1 \
qt5qmlimport-org.kde.ksysguard.formatter.1 \
qt5qmlimport-org.kde.ksysguard.page.1 \
qt5qmlimport-org.kde.ksysguard.process.1 \
qt5qmlimport-org.kde.ksysguard.sensors.1 \
qt5qmlimport-org.kde.ksysguard.table.1 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.qqc2desktopstyle.private.1 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

inherit rpm
