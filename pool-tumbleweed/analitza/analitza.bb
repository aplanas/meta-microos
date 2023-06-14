SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "analitza-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d1f0bac60fc46f234b51c8d800dc750e7f75b4ff3fdc895462c0d90b0bdc2d43907c845b96361b3e833d09091360c6aa0eaa513351dcaf56f9fafa7800f0110f"

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
