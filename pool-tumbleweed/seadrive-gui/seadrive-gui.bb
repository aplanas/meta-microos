SUMMARY = "GUI part of seafile drive"
DESCRIPTION = "This package provides a graphical user interface for seadrive-fuse"
LICENSE = "GPL-3.0-only"

PV = "2.0.25"

RPM_NAME = "seadrive-gui-2.0.25-1.4.aarch64.rpm"
RPM_HASH = "a2c1ec5e3aefefd5f546c6b6dfa2247ffe1776342b5b9dad8b16b37e94d9d2e63f626715d0d089eba43f55f9df693fe1105003e726251dfb1d897b3b6e6941d7"

RPROVIDES:${PN} += "application() \
application(seadrive.desktop) \
seadrive-gui \
seadrive-gui(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libsearpc.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
seadrive-fuse"

inherit rpm
