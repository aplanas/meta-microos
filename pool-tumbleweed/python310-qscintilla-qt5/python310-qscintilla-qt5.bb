SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python310-qscintilla-qt5-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "542e43c09d78a7a8d41a8645f96cb9ccd96fdf89075254b8dd70dae1d136e874560a5f8cc25edee45ff1befcd5f772dff43e1f8f65de7f173cd55d5d53fd2410"

RPROVIDES:${PN} += "python3-qscintilla-qt5 \
python3-qscintilla-qt5-sip \
python3.10dist-qscintilla \
python310-qscintilla-qt5 \
python310-qscintilla-qt5-sip \
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
python310-PyQt5"

inherit rpm
