SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "analitza-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "faadcf987184d6c21df86cd99517614293ecba39869e09541977eda4f62f56aa5ff04b6d7a80437c08d2c59d7a1af2f72dcabd5097a7d87840d8b1259dc1a13f"

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
