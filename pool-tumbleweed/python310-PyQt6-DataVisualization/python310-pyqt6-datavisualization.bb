SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-DataVisualization-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "a2bcdf84025c4a40caf9b612b7f3c677c6276d423a52437ba23ec81b9ee7b94adbc1a6ac9177c85f974c8c84dbd14645a6814c3ce7301938d92f4937e7f9c61c"

RPROVIDES:${PN} += "python3.10dist-pyqt6-datavisualization \
python310-PyQt6-DataVisualization \
python310-qtdatavisualization-qt6 \
python3dist-pyqt6-datavisualization"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-PyQt6"

inherit rpm
