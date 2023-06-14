SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "afdaf5640df0f6d6857edbd4e1694f05789a6ad36a42aeefa5d01a14bbef3b80ddb42e87e8702c0a99b2a05c3142bdaeb8e0a9c7244b8e62a8f8bd28e5dd2d63"

RPROVIDES:${PN} += "python3-PyQt6-Charts \
python3-qtcharts-qt6 \
python3.10dist-pyqt6-charts \
python310-PyQt6-Charts \
python310-qtcharts-qt6 \
python3dist-pyqt6-charts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-PyQt6"

inherit rpm
