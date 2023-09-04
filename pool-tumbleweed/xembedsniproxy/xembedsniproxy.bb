SUMMARY = "XEmbed SNI Proxy"
DESCRIPTION = "This package provides a proxy translating XEmbed for SNI trays. \
Can also be used by standalone tray apps."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "xembedsniproxy-5.27.7-3.1.aarch64.rpm"
RPM_HASH = "eefdbf23228ad88a3f1737f9981fd331ff22929ab1590ebf00d09cfbee24685e2ebee5e6dfab42f31b661e772f056ce4b64a83812a5b53d1ad23dfb4e7285465"

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
