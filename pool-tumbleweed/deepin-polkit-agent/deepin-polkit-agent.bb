SUMMARY = "Deepin Polkit Agent"
DESCRIPTION = "DDE Polkit Agent is the polkit agent used in Deepin Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-5.5.21-1.2.aarch64.rpm"
RPM_HASH = "f57cde2ec413e748f03b6167e3846105b63dcdce0f7240784c37deeb0faaca7f5b9bc31e7f068b46d85274f3f56a6e8e0b7f16a61472d1fca59c294d10a67b84"

RPROVIDES:${PN} += "deepin-polkit-agent \
deepin-polkit-agent(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdframeworkdbus.so.2()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libpolkit-qt5-agent-1.so.1()(64bit) \
libpolkit-qt5-core-1.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
