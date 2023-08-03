SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "3593eb5f94c7401d244338949a3f2d4e0447a4b98446558cdc09f3ddf136782757a37e720e141f02bcb00d8ecd9ed6b1f019eaa20a247d5318c113b87492217f"

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
