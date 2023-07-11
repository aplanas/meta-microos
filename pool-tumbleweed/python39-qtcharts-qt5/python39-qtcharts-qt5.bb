SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-5.15.6-1.14.aarch64.rpm"
RPM_HASH = "34a444da3cbce2557e1f4dc5ffa40e354b2220f5406e684a3214964fc5a7b42c06e948532c546458414dff68d883b35c4ecf8d173a82dd0554909c4e74e3b466"

RPROVIDES:${PN} += "python3.9dist-pyqtchart \
python39-PyQtChart \
python39-qtcharts-qt5 \
python3dist-pyqtchart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-qt5 \
python39-qt5-sip"

inherit rpm
