SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "libqscintilla2_qt5-15-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "4de22481c2630a45a3a974a94735781e6a19990585028224eefdd8cef592379011bddac9f791e2cfc86793cc6d97303a580c647330ebbc20d089b04b3ad274a7"

RPROVIDES:${PN} += "libqscintilla2-qt5-15 \
libqscintilla2-qt5.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qscintilla2-qt5"

inherit rpm
