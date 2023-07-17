SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kplotting-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e4ec7e2e831bd92affd1929e1e1fd86a281c56b18b94cbf6062e625c85f589ae5c9fec9aa84a9191a860e4fb2e52439518ff42e5952425509ca7a3b4ccec8c86"

RPROVIDES:${PN} += "cmake-KF5Plotting \
kplotting-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5Plotting.so.5 \
libKF5Plotting5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
