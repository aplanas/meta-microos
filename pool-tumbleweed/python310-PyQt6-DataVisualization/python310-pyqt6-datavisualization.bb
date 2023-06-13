SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-DataVisualization-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5a6470fda6f0edf6fb31c6b0a4c28e32b67f83fe2b9aa1ceecedf48a669e289a1aece1a175cc705c3acaa2af74711527a43ea6c88d191a6f5dcece9c39addd8f"

RPROVIDES:${PN} += "python3-PyQt6-DataVisualization \
python3-qtdatavisualization-qt6 \
python3.10dist(pyqt6-datavisualization) \
python310-PyQt6-DataVisualization \
python310-PyQt6-DataVisualization(aarch-64) \
python310-qtdatavisualization-qt6 \
python3dist(pyqt6-datavisualization)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DataVisualization.so.6()(64bit) \
libQt6DataVisualization.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-PyQt6"

inherit rpm
