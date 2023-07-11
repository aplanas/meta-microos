SUMMARY = "Development files for the Qt5 Data Visualization module"
DESCRIPTION = "This package provides header files and shared libraries for development with \
Qt Data Visualization."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5DataVisualization5-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "67df22ae9d85e72b2ca08f1c2e9a30872862d2ff08b105057dd312aee93b9d27ca1c2415ce8b9dcd2d3cca31caf8b61d60b1122ee4c3f6b0f2f589ceccff60a0"

RPROVIDES:${PN} += "cmake-Qt5DataVisualization \
libQt5DataVisualization5-devel \
pkgconfig-Qt5DataVisualization"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5DataVisualization5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
