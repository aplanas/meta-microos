SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class for qt6 \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt6-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "0c62c623495c683f869a72e59f61371ff8e75cdcd062d6293c8bd3d823325cd00c769948a7d3182431713192357b80d92eedaa219d04f7990c648a60c45bf721"

RPROVIDES:${PN} += "libqscintillaplugin.so \
qscintilla-qt6 \
qscintilla2-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqscintilla2-qt6.so.15 \
libstdc++.so.6"

inherit rpm
