SUMMARY = "XEmbed SNI Proxy"
DESCRIPTION = "This package provides a proxy translating XEmbed for SNI trays. \
Can also be used by standalone tray apps."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "xembedsniproxy-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "990942f5ba189bf6cc02fcb7a1b1789a16c74d3ec39ca96a4efad8394d0d2fb8df976fec5ad0a1c9c0a2141023a391643958cf046bd3ef8bbce17c9ae864313f"

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
