SUMMARY = "Keyboard and mouse configuration tool"
DESCRIPTION = "LXinput is just the LXDE Keyboard and mouse config tool"
LICENSE = "GPL-2.0"

PV = "0.3.5"

RPM_NAME = "lxinput-0.3.5-1.27.aarch64.rpm"
RPM_HASH = "81d2458f43757f56e5421f491e36b2a29a4f74bf573c01de1736f4e3d93f4d38eb026e4f428b96869349ec113796b005d5a309a91fc76e83d1d32e004c68e52c"

RPROVIDES:${PN} += "lxinput"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
