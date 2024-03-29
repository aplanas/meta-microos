SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python310-PyQt6-QScintilla-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "320617ac2d3d12a88a199397f8305b465165a9bf76568ba1d20bf6b4d195797ec4211c070ae17ff370c63712cf352ae1573df11f1d9f1bb64f841091fda52fee"

RPROVIDES:${PN} += "python3.10dist-pyqt6-qscintilla \
python310-PyQt6-QScintilla \
python310-qscintilla-qt6 \
python3dist-pyqt6-qscintilla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqscintilla2-qt6.so.15 \
libstdc++.so.6 \
python-abi \
python310-PyQt6"

inherit rpm
