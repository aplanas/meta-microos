SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "fc3069e0428b797307e9f84e4d0eb996500ea083920dc0a7db0b1224253cf71bf5ec7cf115bf938f341b73192727dc3d0da2dbe393434349e039770e52c95d30"

RPROVIDES:${PN} += "python3.9dist-pyqt6-charts \
python39-PyQt6-Charts \
python39-qtcharts-qt6 \
python3dist-pyqt6-charts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-PyQt6"

inherit rpm
