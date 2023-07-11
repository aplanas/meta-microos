SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "a9c242e165e6846e9309e6e30480196983a92c8fbac974ef7e2b099e0f2d9c1ab3e29d4c156a834d32588f79eeff8de84a8d0827b6e6cccf4072599f8687d6da"

RPROVIDES:${PN} += "python3-PyQt6-Charts \
python3-qtcharts-qt6 \
python3.11dist-pyqt6-charts \
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
