SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "libqscintilla2_qt5-15-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "e80e1e161733c62ee5bb298946cfc4c0ff1b7ae565d68efcf6bf84402c8725d9117830599b44d070171a2b6142871df79082c3a3023c3ec3731676b07d551c9b"

RPROVIDES:${PN} += "libqscintilla2-qt5-15 \
libqscintilla2_qt5-15 \
libqscintilla2_qt5-15(aarch-64) \
libqscintilla2_qt5.so.15()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qscintilla2_qt5"

inherit rpm
