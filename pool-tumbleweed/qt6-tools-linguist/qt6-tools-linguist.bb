SUMMARY = "Translation tool for Qt applications"
DESCRIPTION = "Qt Linguist can be used by translator to translate text in Qt applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-linguist-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0976703f30e8208236e83f6d888c22bffd6e373fe600766c7ca8bb34dc83aafb2b2af2930acbaccc77eaa829d85f6ad5fdffa571676df9dc3820f508ba5ce534"

RPROVIDES:${PN} += "application() \
application(org.qt.linguist6.desktop) \
mimehandler(application/x-linguist) \
qt6-tools-linguist \
qt6-tools-linguist(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6UiTools.so.6()(64bit) \
libQt6UiTools.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
