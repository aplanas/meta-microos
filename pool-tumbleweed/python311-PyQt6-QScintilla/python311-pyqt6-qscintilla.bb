SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python311-PyQt6-QScintilla-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "cb409e9ef9810433e2c1ecde0e0187a5aed8d3741f77121c8c0399d625e23445e476ada2edf3e173803361d87c4fe16b4eab0960a49d1489a01c10e96494689c"

RPROVIDES:${PN} += "python3-PyQt6-QScintilla \
python3-qscintilla-qt6 \
python3.11dist-pyqt6-qscintilla \
python311-PyQt6-QScintilla \
python311-qscintilla-qt6 \
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
python311-PyQt6"

inherit rpm
