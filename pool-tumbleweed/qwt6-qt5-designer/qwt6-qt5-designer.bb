SUMMARY = "Plugin for the Qt5 Interface designer"
DESCRIPTION = "The qwt6-qt5-designer package contains the plugin for the Qt5 User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt5-designer-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "b9ff67593d237b0568d392123d9d79f3fd0ab701ff71daf8e937a468faa9cac4ce57ff2db9203eb2d4dd4bc36a5d4b6a1f92d808ba76230e058068041fb9224a"

RPROVIDES:${PN} += "libqwt_designer_plugin.so()(64bit) \
qwt-qt5-designer \
qwt6-qt5-designer \
qwt6-qt5-designer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qwt6-qt5-devel"

inherit rpm
