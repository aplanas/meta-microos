SUMMARY = "Documentation browser"
DESCRIPTION = "Qt Assistant is a tool for viewing documentation in Qt help file format."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-assistant-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "459554b3da2e611fad6b1638c0c4e90a499c276e1dc57285a8bed857736f137783c1ea2b98f9809f0a8f0ad8e10bd96abd5e69c2e27f8bb4de7630f6943851f1"

RPROVIDES:${PN} += "application() \
application(org.qt.assistant6.desktop) \
mimehandler(application/x-assistant) \
qt6-tools-assistant \
qt6-tools-assistant(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Help.so.6()(64bit) \
libQt6Help.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
