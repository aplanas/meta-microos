SUMMARY = "Qt 5 Linguist Tools"
DESCRIPTION = "The Qt 5 Linguist Tools."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-linguist-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "3f22b758e54a069bf58705206971bd842450b82582de5ff00549b0deac5a37fdb033344363259506485745bd42ab901072c2b0100a90506d693cf6928dcc8eb0"

RPROVIDES:${PN} += "application() \
application(linguist5.desktop) \
libqt5-linguist \
libqt5-linguist(aarch-64) \
mimehandler(application/x-linguist)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5PrintSupport5 \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets5 \
libQt5Xml5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
