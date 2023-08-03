SUMMARY = "Translation tool for Qt applications"
DESCRIPTION = "Qt Linguist can be used by translator to translate text in Qt applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-linguist-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "92faf52840be0590b0aac9b0203507c3b329d2793730bae183d12463710f2500ebc209e4af224c85ca54e83a016a5af6fe90b1bee0765a680558e9e67d055686"

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
