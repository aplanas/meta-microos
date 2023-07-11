SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-DataVisualization-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "23b558ce37748bd27092bdc311ce33778386904967c6f40bafb97cabceef199d0ab37d4849ccb5fb5a9f9182d6a74d4893c0d0024727fd1002c2de925c087bd7"

RPROVIDES:${PN} += "python3-PyQt6-DataVisualization \
python3-qtdatavisualization-qt6 \
python3.11dist-pyqt6-datavisualization \
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
