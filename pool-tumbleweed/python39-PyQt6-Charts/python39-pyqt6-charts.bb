SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "1b7a58bcb6dc3c8f4a2518ed175fd9ee4d721b43372ad4234a1f33f4c76e884ff2c840ecd2bc88226bea930668acee05761106db88327bcdc62fddf8b3e05ac6"

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
