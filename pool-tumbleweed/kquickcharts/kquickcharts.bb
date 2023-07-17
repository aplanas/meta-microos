SUMMARY = "Set of charts for QtQuick applications"
DESCRIPTION = "The Quick Charts module provides a set of charts that can be used from QtQuick \
applications. They are intended to be used for both simple display of data as \
well as continuous display of high-volume data (often referred to as plotters). \
The charts use a system called distance fields for their accelerated rendering, \
which provides ways of using the GPU for rendering 2D shapes without loss of \
quality."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kquickcharts-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "72a300841adb4892a7fbf1d267b6ac58e5b05513a0e38a0b57323c9bcdabda7d2a7442ece7b30285089fb9958e183e287b5cec15881d6879c80e507ea42d8e34"

RPROVIDES:${PN} += "kquickcharts \
libQuickCharts.so \
libQuickChartsControls.so \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libm.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

inherit rpm
