SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class for qt5 \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt5-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "a93f72f0504fbb4803a20834d37623855bd4584cf21e5beadc7d29e2954fafd108292a2083f3cc3427c8579039efcb2177e500514a3fdc40499e3b46f8366409"

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
