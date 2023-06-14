SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtdatavis3d-qt5-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "d717ffe5a583da9d2c67f92bc4bd2dcc4d9d17dd42f32feb1fe87bb6a2b0279591713e58de12790ba129ee7f423569f01ef470fa44cec82edde86ca4a005ebe8"

RPROVIDES:${PN} += "python3-PyQtDataVisualization \
python3-qtdatavis3d-qt5 \
python3.10dist-pyqtdatavisualization \
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
