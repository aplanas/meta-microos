SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class for qt6 \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt6-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "942e839b28c508cd48fcb1c77552a4890204444b74a8e92841bf2e4ea3818ced76c75b091c597d8bb6beb68e0070d61b9262a96e9e63f87a81db6ac756a0727d"

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
