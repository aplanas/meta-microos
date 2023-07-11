SUMMARY = "Qt5 Quick 3D examples"
DESCRIPTION = "Examples for the Qt Quick 3D module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtquick3d-examples-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "7c2f78663cedad703462134dce4ea3696a5c7d57b28c9f89cf2c1c9ad9f558e1677d1811d3d9dc8189c2c8e4c00284d812ee3153a17769801703929978dd948c"

RPROVIDES:${PN} += "libqt5-qtquick3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtQuick3D.1 \
qt5qmlimport-QtQuick3D.Effects.1 \
qt5qmlimport-QtQuick3D.Helpers.1 \
qt5qmlimport-QtQuick3D.Materials.1"

inherit rpm
