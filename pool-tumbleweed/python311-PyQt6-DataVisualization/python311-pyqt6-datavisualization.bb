SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-DataVisualization-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b81cd462157d349110d1f351bfbe17c9bb2d391c1d0ecdc436d577655f240cb8d4ba60d708118b4cc3ccb85340c6c9fdc5906742a3eaf1316c47b689aea72d3b"

RPROVIDES:${PN} += "python3.11dist-pyqt6-datavisualization \
python311-PyQt6-DataVisualization \
python311-qtdatavisualization-qt6 \
python3dist-pyqt6-datavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-PyQt6"

inherit rpm
