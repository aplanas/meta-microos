SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class for qt5 \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt5-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "b9681b3fffb5782c667fea58c819734ccff3c3d573cf74e8777e4c256b05eef54ae00d86f83e8775f52277be568b0fde6a0d741509292107233c50549ee9a9c2"

RPROVIDES:${PN} += "libqscintillaplugin.so \
qscintilla-qt5 \
qscintilla2-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqscintilla2-qt5.so.15 \
libstdc++.so.6"

inherit rpm
