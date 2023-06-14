SUMMARY = "System helper creating thumbnails"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the thumbnailer utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-thumbnailer-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "e18bdf371f87042e832cdb537a4331b68f53a81914c20a77c42e91d1763fda70e4d36fca4088e97ddc09f9f6b62180682aa0168079fd6ecc61c840d90aa49fe1"

RPROVIDES:${PN} += "gdk-pixbuf-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
