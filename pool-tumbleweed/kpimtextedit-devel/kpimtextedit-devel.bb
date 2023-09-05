SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kpimtextedit-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3f964530fd6ab470c68164a6445ee86f08854c98412a50b0a431c8b812c642c92f082ec9405055e33f425aac051b73e81bd9266f446e8d33be60a5535fcabb0e"

RPROVIDES:${PN} += "cmake-KF5PimTextEdit \
cmake-KPim5TextEdit \
kpimtextedit-devel"

RDEPENDS:${PN} += "cmake-KF5SyntaxHighlighting \
cmake-KF5TextEditTextToSpeech \
cmake-KF5TextWidgets \
ld-linux-aarch64.so.1 \
libKPim5TextEdit.so.5 \
libKPim5TextEdit5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
