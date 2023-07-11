SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python311-qscintilla-qt5-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "ee77c9745542105bd0c8d740a938285167ac46ee97bccc26a8fb6344b0f207c772e036e6581b796236265cd6f0944c0e17657fa20c74036f8ad063985b3dc4f9"

RPROVIDES:${PN} += "python3-qscintilla-qt5 \
python3-qscintilla-qt5-sip \
python3.11dist-qscintilla \
python311-qscintilla-qt5 \
python311-qscintilla-qt5-sip \
python3dist-qscintilla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqscintilla2-qt5.so.15 \
libstdc++.so.6 \
python-abi \
python311-PyQt5"

inherit rpm
