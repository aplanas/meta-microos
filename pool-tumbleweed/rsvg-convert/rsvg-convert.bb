SUMMARY = "SVG Convert using the GNOME Render SVG library"
DESCRIPTION = "This package contains a tool to convert SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "rsvg-convert-2.56.1-3.1.aarch64.rpm"
RPM_HASH = "419e0b28479b449d467d0fc430dc8e384b41cdb8810d1efda35cf6ba84b69cd66669ec2bd0233f59054fd73f34e8609d7cb20457997062aee307feb2c372e9b5"

RPROVIDES:${PN} += "rsvg-convert"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
