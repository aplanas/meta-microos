SUMMARY = "Qt platform theme integration plugins"
DESCRIPTION = "Multiple Qt plugins to provide better Qt5 integration for DDE are included."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "qt5integration-5.5.24-1.7.aarch64.rpm"
RPM_HASH = "7c919e49314b6c443233558396c9787695c926b8e593ac916e479ef9411651b87d8ce43110827489f9f62e1aec81629303a52415960d891e9e97f18da92692c3"

RPROVIDES:${PN} += "libchameleon.so \
libdsvg.so \
libdsvgicon.so \
libdtkbuiltin.so \
libqdeepin.so \
libxdgicon.so \
qt5integration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libQt5XdgIconLoader.so.3 \
libX11.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
