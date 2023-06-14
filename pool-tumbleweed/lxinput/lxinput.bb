SUMMARY = "Keyboard and mouse configuration tool"
DESCRIPTION = "LXinput is just the LXDE Keyboard and mouse config tool"
LICENSE = "GPL-2.0"

PV = "0.3.5"

RPM_NAME = "lxinput-0.3.5-1.26.aarch64.rpm"
RPM_HASH = "60695c4aa896c4ec98bd55aa4951da291eadc3a346456b507e7bad5aa880fb340d60d57bfe1f486dcfae234cab1a1dc8308d3701da9c95ed48948e96af8a8a5c"

RPROVIDES:${PN} += "lxinput"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
