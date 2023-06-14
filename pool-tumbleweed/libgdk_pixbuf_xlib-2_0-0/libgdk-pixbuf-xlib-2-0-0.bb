SUMMARY = "An GdkPixbuf compat library"
DESCRIPTION = "gdk-pixbuf-xlib is an image loading library that can be extended by \
loadable modules for new image formats. It is used by toolkits such \
as GTK+ or Clutter. \
 \
This package is a compat package providing various functions to \
integrate GdkPixbuf with Xlib data types"
LICENSE = "LGPL-2.1-or-later"

PV = "2.40.2"

RPM_NAME = "libgdk_pixbuf_xlib-2_0-0-2.40.2-1.10.aarch64.rpm"
RPM_HASH = "99aa95616034613f87fc6372c204a08c1a3472317bd01e3417a4abca983d68db0b49eda4680db7d6a259656d3a5911b3058146e0a047a5a1c69cc32475a01615"

RPROVIDES:${PN} += "libgdk-pixbuf-xlib-2-0-0 \
libgdk-pixbuf-xlib-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
