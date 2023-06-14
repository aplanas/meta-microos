SUMMARY = "C++ Editor Class Library"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/)."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "libqscintilla2_qt6-15-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "f460a918a01e0552c4547e20c5cf34e6243ea827179d83bad0aa885f86b47ccf2285ecf41da0323e1fa8221559e6cc429065e74c8db92325eff26cfbedeee1b2"

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
