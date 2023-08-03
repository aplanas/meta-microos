SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "4ae9c8b5ba7952090eb01c2dc0c428b00f89e532d63d844c791794a26dee1d15c010779aa056b9e99d5ab30ed22e241b55c856ebb9653bff76c21aedf120d3e7"

RPROVIDES:${PN} += "python3.10dist-pyqt6-charts \
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
