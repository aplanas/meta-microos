SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtdatavis3d-qt5-5.15.5-1.6.aarch64.rpm"
RPM_HASH = "eac3e4f9cc92604a33161423136ec9076e9b141f79dd80e0b3fb6c6e51bc61ed7bef3031fc4105e313e6a5f8b2378b94b4c44b6d5864caeabaa57b839780eaca"

RPROVIDES:${PN} += "python3-PyQtDataVisualization \
python3-qtdatavis3d-qt5 \
python3.11dist-pyqtdatavisualization \
python311-PyQtDataVisualization \
python311-qtdatavis3d-qt5 \
python3dist-pyqtdatavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-qt5 \
python311-qt5-sip"

inherit rpm
