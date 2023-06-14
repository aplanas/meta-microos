SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python39-PyQt6-QScintilla-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "0bf5ab4df87fbcc20feced2ff06102480f9e10502d4417f4e5b52bd51f4d4e0b2b133af5e2bd15f8982c269673607e598984130084ef628ba10fe7d0b6037700"

RPROVIDES:${PN} += "python3.9dist-pyqt6-qscintilla \
python39-PyQt6-QScintilla \
python39-qscintilla-qt6 \
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
python39-PyQt6"

inherit rpm
