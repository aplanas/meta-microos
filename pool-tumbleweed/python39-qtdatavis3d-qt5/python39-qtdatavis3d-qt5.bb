SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "a8c956bad5b18436742dcf3fce5ccbe3d69ddc3591239bc8088dd01150cff7035a492fa81389cb0c730fb5352c1c75658b3edc799022306b122e79f142fcf66b"

RPROVIDES:${PN} += "python3.9dist-pyqtdatavisualization \
python39-PyQtDataVisualization \
python39-qtdatavis3d-qt5 \
python3dist-pyqtdatavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-qt5 \
python39-qt5-sip"

inherit rpm
