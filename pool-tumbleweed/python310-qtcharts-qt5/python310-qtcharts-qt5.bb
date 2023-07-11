SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "50d2ca53d278f2762b85c976bc5f8a3f1a229d4d559fca66d78787ae1ae1970085f7cb0893bdafb0c9004c0f1d2222f0b059da5be35f1c5bd0eed26e4a1af880"

RPROVIDES:${PN} += "python3.10dist-pyqtchart \
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
