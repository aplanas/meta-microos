SUMMARY = "Utility to create a cache of gdk-pixbuf loaders"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the utility to create the cache file needed for \
loadable modules."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-query-loaders-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "01d0ec8e1db536b6676fe7da09fe29743da7d4f02edb54891c7a9dc8aa3f71b88f480e09c4f7d9678bc146c257caf9c12c3f7ef2c0091497650ff5dcb0916165"

RPROVIDES:${PN} += "gdk-pixbuf-query-loaders"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
