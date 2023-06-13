SUMMARY = "A desktop annotation tool"
DESCRIPTION = "Gromit-MPX is a multi-pointer GTK3 port of the original Gromit desktop annotation tool. \
It enables graphical annotations with several pointers at once and is A LOT faster than \
its predecessor since it uses the XCOMPOSITE extension where available."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "gromit-mpx-1.4-1.11.aarch64.rpm"
RPM_HASH = "de59f6c62f7f6e0afa6595d73d24f8b135ff9d62c7e6ab61f2d19ba5ddb8879e1f447cdf54a9cf013ec94698c19fbc2c2db0b590d4f2480cdf2dfe3e3fe22ef4"

RPROVIDES:${PN} += "application() \
application(net.christianbeier.Gromit-MPX.desktop) \
config(gromit-mpx) \
gromit \
gromit-mpx \
gromit-mpx(aarch-64) \
metainfo() \
metainfo(net.christianbeier.Gromit-MPX.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libappindicator3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
