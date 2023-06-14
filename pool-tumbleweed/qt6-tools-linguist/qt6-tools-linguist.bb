SUMMARY = "Translation tool for Qt applications"
DESCRIPTION = "Qt Linguist can be used by translator to translate text in Qt applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-linguist-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0976703f30e8208236e83f6d888c22bffd6e373fe600766c7ca8bb34dc83aafb2b2af2930acbaccc77eaa829d85f6ad5fdffa571676df9dc3820f508ba5ce534"

RPROVIDES:${PN} += "qt6-tools-linguist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
