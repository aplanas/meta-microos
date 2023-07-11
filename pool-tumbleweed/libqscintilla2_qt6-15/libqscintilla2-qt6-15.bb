SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "libqscintilla2_qt6-15-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "bbb1eb623472da29f41fc973fd9764453ec37bede544e34b4b9bf46305457a2182375798774cf82cd44184cf00aa3c0d13d2a4f7cbf093b7311a8462975ce1b4"

RPROVIDES:${PN} += "libqscintilla2-qt6-15 \
libqscintilla2-qt6.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qscintilla2-qt6"

inherit rpm
