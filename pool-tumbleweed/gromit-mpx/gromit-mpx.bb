SUMMARY = "A desktop annotation tool"
DESCRIPTION = "Gromit-MPX is a multi-pointer GTK3 port of the original Gromit desktop annotation tool. \
It enables graphical annotations with several pointers at once and is A LOT faster than \
its predecessor since it uses the XCOMPOSITE extension where available."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "gromit-mpx-1.4-1.11.aarch64.rpm"
RPM_HASH = "de59f6c62f7f6e0afa6595d73d24f8b135ff9d62c7e6ab61f2d19ba5ddb8879e1f447cdf54a9cf013ec94698c19fbc2c2db0b590d4f2480cdf2dfe3e3fe22ef4"

RPROVIDES:${PN} += "config-gromit-mpx \
gromit \
gromit-mpx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libappindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
