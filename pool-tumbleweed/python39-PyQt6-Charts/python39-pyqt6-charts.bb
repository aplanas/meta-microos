SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "773a6fc97c54f0f35071fbd1d6309b3a4200f38bcf99d77dfb6bd7d43b04df2830320e0ff1bb92e32811eb9d64b64f6c215dc97fa84bf60e8b92b1abab40d1d0"

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
