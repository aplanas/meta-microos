SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-5.15.5-1.6.aarch64.rpm"
RPM_HASH = "f4bf4953955ae035add4dcb5a79ec077bf6cc98cdf389f5a5561de914e9dc7b123273e69414354513607e2cbba5e7956cefb3aee94374cc58b3f531f22486bfd"

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
