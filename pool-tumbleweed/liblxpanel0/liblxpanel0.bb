SUMMARY = "LXDE panel libraries"
DESCRIPTION = "Library for interpolability and access to the lxpanel API by plugins."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "liblxpanel0-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "7e462e7674fdc7b481415bae258fdae82d9e2e64ae5192f01c3b27ffb5aeff67ca3bf9854a1769d3873f1f2677e0fbc4e45867257badea34ef8888bc8779ec75"

RPROVIDES:${PN} += "liblxpanel.so.0 \
liblxpanel0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfm-gtk.so.4 \
libfm.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libkeybinder.so.0 \
libpango-1.0.so.0"

inherit rpm
