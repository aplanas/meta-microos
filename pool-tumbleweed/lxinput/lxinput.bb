SUMMARY = "Keyboard and mouse configuration tool"
DESCRIPTION = "LXinput is just the LXDE Keyboard and mouse config tool"
LICENSE = "GPL-2.0"

PV = "0.3.5"

RPM_NAME = "lxinput-0.3.5-1.26.aarch64.rpm"
RPM_HASH = "60695c4aa896c4ec98bd55aa4951da291eadc3a346456b507e7bad5aa880fb340d60d57bfe1f486dcfae234cab1a1dc8308d3701da9c95ed48948e96af8a8a5c"

RPROVIDES:${PN} += "application() \
application(lxinput.desktop) \
lxinput \
lxinput(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
