SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python311-PyQt6-QScintilla-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "45b42c86228806a60caf79cba3c0fffd5d58405d4b2ae33311eb7d4343883ba598ba4868fc1c030db074e71a79973ac1eca79a7a5c90386ec2e390c2a740e122"

RPROVIDES:${PN} += "python3.11dist(pyqt6-qscintilla) \
python311-PyQt6-QScintilla \
python311-PyQt6-QScintilla(aarch-64) \
python311-qscintilla-qt6 \
python3dist(pyqt6-qscintilla)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libqscintilla2_qt6.so.15()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-PyQt6"

inherit rpm
