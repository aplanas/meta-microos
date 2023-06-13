SUMMARY = "Deepin Shortcut Viewer"
DESCRIPTION = "The program displays a shortcut key window when a JSON data is passed."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.6"

RPM_NAME = "deepin-shortcut-viewer-5.0.6-1.3.aarch64.rpm"
RPM_HASH = "613e68775e4e1ebaca1e9f7b85ae0827dd54c96e07dc3f4a4927009a28cb3d4a930d049b953a76221b8ff468a885eb073ea83230b60461519e9ff27a5f6e793b"

RPROVIDES:${PN} += "bundled(CuteLogger) \
deepin-shortcut-viewer \
deepin-shortcut-viewer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
