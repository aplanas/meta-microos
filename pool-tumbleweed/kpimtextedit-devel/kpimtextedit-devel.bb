SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kpimtextedit-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8cfd4e17a6710fbd9023512c45e4b576bdfd2a50543d00bb91924d5ef07f244c9b56f9e7e92668ac58c97d9375da7c397df86520c09633bfa75cded19c519e15"

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
