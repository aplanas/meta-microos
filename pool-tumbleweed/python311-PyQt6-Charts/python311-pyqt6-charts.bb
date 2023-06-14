SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "977c395c0c0ef3682e6181f1c51dabfd823e4c1e025dfd5c1fc2079f35a27b3cc6db826cd82c01e537d1e0b17cc3498422449a31986bb7b09744961274a14961"

RPROVIDES:${PN} += "python3.11dist-pyqt6-charts \
python311-PyQt6-Charts \
python311-qtcharts-qt6 \
python3dist-pyqt6-charts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-PyQt6"

inherit rpm
