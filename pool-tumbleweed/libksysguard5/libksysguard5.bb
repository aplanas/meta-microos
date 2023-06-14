SUMMARY = "Task management and system monitoring library"
DESCRIPTION = "Task management and system monitoring library."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libksysguard5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "dd2bef88fa90511de798fe0a13cbd443a8be2963175dbb73c3e1bc5765f56ec812dffc3b8611c31336d0102677dfe041332d4375182a9f8e05d3522812367de5"

RPROVIDES:${PN} += "libKSysGuardFormatter.so.1 \
libKSysGuardSensorFaces.so.1 \
libKSysGuardSensors.so.1 \
libksgrd.so.9 \
libksignalplotter.so.9 \
libksysguard5 \
liblsofui.so.9 \
libprocesscore.so.9 \
libprocessui.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigQml.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5Package.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKSysGuardSystemStats.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXRes.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.ksysguard.faces.1 \
qt5qmlimport-org.kde.ksysguard.formatter.1 \
qt5qmlimport-org.kde.ksysguard.sensors.1 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

inherit rpm
