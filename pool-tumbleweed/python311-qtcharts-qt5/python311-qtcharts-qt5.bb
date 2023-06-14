SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "80bd36ae9f0fd2a5ea4ffd2e2b4b7628a0cd7eac18b2e3f25d06ef98cf99e552f6256c0c1e4b4be47f71f4fd1a58943d7939323364078b71c3057d78d75ef32a"

RPROVIDES:${PN} += "python3.11dist-pyqtchart \
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
