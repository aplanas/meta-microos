SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-DataVisualization-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "10b893b69ff25a3aeb54ca4028bfb64501f6e704a00060c50b6965c815b07999110a01c76d62880718effe02217e1528e6d632f07646419c47f721fd3c2dae99"

RPROVIDES:${PN} += "python3.9dist-pyqt6-datavisualization \
python39-PyQt6-DataVisualization \
python39-qtdatavisualization-qt6 \
python3dist-pyqt6-datavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-PyQt6"

inherit rpm
