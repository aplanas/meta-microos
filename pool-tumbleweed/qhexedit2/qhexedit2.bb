SUMMARY = "Qt-based hex editor"
DESCRIPTION = "QHexEdit is a hex editor widget written in C++ for the Qt framework. \
It is a simple editor for binary data, just like QPlainTextEdit is for text \
data."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "qhexedit2-0.8.9-1.15.aarch64.rpm"
RPM_HASH = "598c274874c5c3a863bc65f52959179b0cf2f6a2bd92a121df7960cdc33597e5518b8a9b3cfb1c5e597ceb987ddce04931a207c9d266a47dfd533c13da2318b1"

RPROVIDES:${PN} += "application() \
application(qhexedit.desktop) \
qhexedit2 \
qhexedit2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
