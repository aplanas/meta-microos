SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "analitza-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "861262f4babbe195d3ec69fd07e8d36d120ea77d68d7aee9e9d472d2784ccd7b92c3a3e229536bb766fa0d7bedeb1f27834a3dede2c827a5a2437489eae79ccd"

RPROVIDES:${PN} += "analitza \
analitza5 \
libanalitzadeclarativeplugin.so \
qt5qmlimport-org.kde.analitza.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAnalitza.so.8 \
libAnalitza8 \
libAnalitzaGui.so.8 \
libAnalitzaPlot.so.8 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.analitza.1"

inherit rpm
