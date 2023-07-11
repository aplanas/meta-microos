SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "d748e854237e343c092d4616c7f5853d52912ce3c1eaea3738675441a3e05608863f5cee38c6de5e10652b756df102b2a6c9cd297a8d84134f21bb8f33eaf657"

RPROVIDES:${PN} += "python3-PyQtChart \
python3-qtcharts-qt5 \
python3.11dist-pyqtchart \
python311-PyQtChart \
python311-qtcharts-qt5 \
python3dist-pyqtchart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-qt5 \
python311-qt5-sip"

inherit rpm
