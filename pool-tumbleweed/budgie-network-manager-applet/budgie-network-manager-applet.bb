SUMMARY = "Network manager applet"
DESCRIPTION = "This is a fork of Wingpanel Network Indicator, ported to budgie desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-network-manager-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "7602ca7929c686eb2b8334a05c783ff2abf1e0d23614cc72f730e8bf474dff9ad5a784ebe6f1fb487c84d49d8b599aebbc366784c6dcc4a92b89561c67f90305"

RPROVIDES:${PN} += "budgie-network-manager-applet \
libnetworkapplet.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libpeas-1.0.so.0"

inherit rpm
