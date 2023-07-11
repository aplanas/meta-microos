SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "b598df19905ff9ca7c1f63cb84444aa067328e33ffa42339de9637b5fc74f5a7a3b1757cbece07575eed369cff8934d638fcec2892712eba0a2ce6da330be3cf"

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
