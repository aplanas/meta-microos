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
libqscintilla2_qt6-15 \
libqscintilla2_qt6-15(aarch-64) \
libqscintilla2_qt6.so.15()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qscintilla2_qt6"

inherit rpm
