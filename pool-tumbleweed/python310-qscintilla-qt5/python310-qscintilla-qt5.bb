SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python310-qscintilla-qt5-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "f10fac01fa3d7c34f4e213dc3e19f0c9e30e5d29049c91e63077fa6b0b5104987db36954f51d83f514951c6ec63e2dc7c037b9a558149a54543c5bf7685d3268"

RPROVIDES:${PN} += "python3.10dist-qscintilla \
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
