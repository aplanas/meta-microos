SUMMARY = "XEmbed SNI Proxy"
DESCRIPTION = "This package provides a proxy translating XEmbed for SNI trays. \
Can also be used by standalone tray apps."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "xembedsniproxy-5.27.6-2.1.aarch64.rpm"
RPM_HASH = "3d7dd453fb07d3c3cdcca5b5a977a43ddc6da63cb2d95a77c73bab61f0152614030b4bf22d97a43dddcbacf92d31325680141f681ce439e6e9a100c611c3a9df"

RPROVIDES:${PN} += "xembed-sni-proxy \
xembedsniproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libXtst.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-image.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
