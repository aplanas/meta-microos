SUMMARY = "LXDE panel libraries"
DESCRIPTION = "Library for interpolability and access to the lxpanel API by plugins."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "liblxpanel0-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "7e462e7674fdc7b481415bae258fdae82d9e2e64ae5192f01c3b27ffb5aeff67ca3bf9854a1769d3873f1f2677e0fbc4e45867257badea34ef8888bc8779ec75"

RPROVIDES:${PN} += "liblxpanel.so.0()(64bit) \
liblxpanel0 \
liblxpanel0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libfm-gtk.so.4()(64bit) \
libfm.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libkeybinder.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
