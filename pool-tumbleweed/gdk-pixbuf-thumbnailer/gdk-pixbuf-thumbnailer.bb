SUMMARY = "System helper creating thumbnails"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the thumbnailer utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-thumbnailer-2.42.10-1.5.aarch64.rpm"
RPM_HASH = "fda540b00ac355128607b46827674b410e0a269860455e0faa8c7f86564f0b280127e2c817dcacabaec75a8e4277b9dc9d36784b23c59feee42712b702c446fa"

RPROVIDES:${PN} += "gdk-pixbuf-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
