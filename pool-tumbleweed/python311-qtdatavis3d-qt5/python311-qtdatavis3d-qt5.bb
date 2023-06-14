SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtdatavis3d-qt5-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "dff01de975126901ba986943a00a5b91c5586a483e0344772aa68549d2ed2a30beec3cdc7f9ba8b8ed6afa494df9b993c03c50cc30c7d56d953107cce8e0ca16"

RPROVIDES:${PN} += "python3.11dist-pyqtdatavisualization \
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
