SUMMARY = "Translation tool for Qt applications"
DESCRIPTION = "Qt Linguist can be used by translator to translate text in Qt applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-linguist-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bb343cf39c3b240333a05d9e363fc4c280a413dfe5e94ae50a8183115f61aee85218cc2a8e36a69ea7932d04cade9e8fb23f30205f0eedebe847f99cfcb8a232"

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
