SUMMARY = "Examples for the qt6-tools modules"
DESCRIPTION = "Examples for the qt6-tools modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "62e708ed6e0eaf3af8906851add163a3f19abf37884a78aaa7354d2f16ebb88f0b7f7c039c9e9389b6718ffbd9a6968111518d7909be84876847056f4ba849cb"

RPROVIDES:${PN} += "qt6-tools-examples \
qt6-tools-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Help.so.6()(64bit) \
libQt6Help.so.6(Qt_6)(64bit) \
libQt6UiTools.so.6()(64bit) \
libQt6UiTools.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
