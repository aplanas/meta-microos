SUMMARY = "Set of charts for QtQuick applications"
DESCRIPTION = "The Quick Charts module provides a set of charts that can be used from QtQuick \
applications. They are intended to be used for both simple display of data as \
well as continuous display of high-volume data (often referred to as plotters). \
The charts use a system called distance fields for their accelerated rendering, \
which provides ways of using the GPU for rendering 2D shapes without loss of \
quality."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kquickcharts-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "dc2f32e69a06808052681dd29bb09b525abe7617af4422e36318a19c5613493d0e846edae00d98b34667afc83673f653bb70070b9a8bf8cfeb712cd7c41ddc09"

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
