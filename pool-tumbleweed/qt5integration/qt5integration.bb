SUMMARY = "Qt platform theme integration plugins"
DESCRIPTION = "Multiple Qt plugins to provide better Qt5 integration for DDE are included."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "qt5integration-5.5.24-1.8.aarch64.rpm"
RPM_HASH = "3431333b1574d30e1b4c84b95d684a527af21a9bf8be805edb79ad1462027bf93dad036ff1faa13d7d5b7fb2da498a2b40e1f37edbfc6aa1e7ecfd39f20f74ee"

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
