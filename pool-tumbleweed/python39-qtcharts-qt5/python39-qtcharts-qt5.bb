SUMMARY = "Python bindings for the Qt5 Charts library"
DESCRIPTION = "PyQtChart is a set of Python bindings for the Qt5 Charts library."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "e4ec12b6c107f90a8c3dd78f9b56c837289303dda1e928aadb316198d62b6cd696174249931ba7c4989acf6a60a9c31dc73ec099a590668f6458c38d0f7bda19"

RPROVIDES:${PN} += "python3.9dist(pyqtchart) \
python39-PyQtChart \
python39-qtcharts-qt5 \
python39-qtcharts-qt5(aarch-64) \
python3dist(pyqtchart)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Charts.so.5()(64bit) \
libQt5Charts.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-qt5 \
python39-qt5-sip"

inherit rpm
