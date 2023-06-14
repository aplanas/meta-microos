SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "e729019aca6db3f0954705c85e264d5773f877f2b1f32a88aa1e33dbff57aa8f32df8c635a3d803688b89a8c4f4f9dc1abb2a895f00fc54f70e4ac762132c828"

RPROVIDES:${PN} += "python3-PyQtChart \
python3-qtcharts-qt5 \
python3.10dist-pyqtchart \
python310-PyQtChart \
python310-qtcharts-qt5 \
python3dist-pyqtchart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5 \
python310-qt5-sip"

inherit rpm
