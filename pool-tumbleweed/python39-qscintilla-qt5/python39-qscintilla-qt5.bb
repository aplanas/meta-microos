SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python39-qscintilla-qt5-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "2158fe32b70bd9de45cd67679c64ec0da251a5520c33b190da1389ea97595a939d2be663948698a0153e6990869083d94913cf3598fe590681bf00747f87afc8"

RPROVIDES:${PN} += "python3.9dist-qscintilla \
python39-qscintilla-qt5 \
python39-qscintilla-qt5-sip \
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
python39-PyQt5"

inherit rpm
