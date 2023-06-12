SUMMARY = "KDE Text editing widgets: Build Environment"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "ktextwidgets-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "90063d5deed08bd40c8e1a43bc453731d033fc8df3227c7978252bcb0308bfab6c7c164cc24c439cbe45a52ccde764bb423e4630caf465e1e5d92cf8384957ea"

RPROVIDES:${PN} += "cmake(KF5TextWidgets) \
ktextwidgets-devel \
ktextwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) \
cmake(KF5Sonnet) \
cmake(Qt5Widgets) \
extra-cmake-modules \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5TextWidgets5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
