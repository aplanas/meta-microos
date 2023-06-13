SUMMARY = "Example plugins for Qt5 Designer"
DESCRIPTION = "Example plugins for Qt5 Designer, e.g. a TicTacToe and a World Clock widget."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-example-plugins-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "e1dd6a3cb4ecc7db7cf2b54a017a0aa68408ec4a2afe815ec93023087bcf7a2fffb7a5ba1638b536ec1136282abb9080f639914c3addbb0f6e88e47d697c9836"

RPROVIDES:${PN} += "libcontainerextension.so()(64bit) \
libcustomwidgetplugin.so()(64bit) \
libqt5-qttools-example-plugins \
libqt5-qttools-example-plugins(aarch-64) \
libtaskmenuextension.so()(64bit) \
libworldtimeclockplugin.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Designer.so.5()(64bit) \
libQt5Designer.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
