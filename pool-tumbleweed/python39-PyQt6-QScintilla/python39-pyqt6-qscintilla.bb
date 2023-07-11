SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python39-PyQt6-QScintilla-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "55ecd7d5e189d51e77823aa3cc06b77381b3a65527d18a92fc5d0be4e12da8f56cf353064f1014641f05453fcf6c06d0ab383771b6460154323554f31b9934c1"

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
