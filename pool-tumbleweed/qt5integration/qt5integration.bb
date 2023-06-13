SUMMARY = "Qt platform theme integration plugins"
DESCRIPTION = "Multiple Qt plugins to provide better Qt5 integration for DDE are included."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "qt5integration-5.5.24-1.7.aarch64.rpm"
RPM_HASH = "7c919e49314b6c443233558396c9787695c926b8e593ac916e479ef9411651b87d8ce43110827489f9f62e1aec81629303a52415960d891e9e97f18da92692c3"

RPROVIDES:${PN} += "libchameleon.so()(64bit) \
libdsvg.so()(64bit) \
libdsvgicon.so()(64bit) \
libdtkbuiltin.so()(64bit) \
libqdeepin.so()(64bit) \
libxdgicon.so()(64bit) \
qt5integration \
qt5integration(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xdg.so.3()(64bit) \
libQt5XdgIconLoader.so.3()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
