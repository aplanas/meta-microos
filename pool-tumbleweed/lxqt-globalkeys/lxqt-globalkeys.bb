SUMMARY = "Global keyboard shortcuts registration"
DESCRIPTION = "Daemon and library for global keyboard shortcuts registration"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "773f55aa4554441c6f239ac88248c14cd5a190bc8185369575f063864c6c666eaa9cadf4720d4a2df9b82db64c0a4b2dfe433156a224cd2af1651829891d8e8a"

RPROVIDES:${PN} += "application() \
application(lxqt-config-globalkeyshortcuts.desktop) \
config(lxqt-globalkeys) \
lxqt-globalkeys \
lxqt-globalkeys(aarch-64) \
lxqt-globalkeys-qt5"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblxqt.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
