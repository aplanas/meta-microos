SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtdatavis3d-qt5-5.15.5-1.6.aarch64.rpm"
RPM_HASH = "442aa2a6861cbc6dcc35ac3fd20373986114ce9fb83538bb7b25213538bd014c17a9638b055eb147fc132da6703fdf0d5d2cdd3e8bfa6f875e8284da708c9274"

RPROVIDES:${PN} += "python3.10dist-pyqtdatavisualization \
python310-PyQtDataVisualization \
python310-qtdatavis3d-qt5 \
python3dist-pyqtdatavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5 \
python310-qt5-sip"

inherit rpm
