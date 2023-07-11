SUMMARY = "Brasero miscellaneous utility function library"
DESCRIPTION = "Brasero is an application to burn CD/DVDs for the GNOME Desktop. It is \
 \
This subpackage contains a library of Brasero with utility functions \
that did not fit in the other two categories (brasero-burn, \
brasero-media)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-utils3-1-3.12.3-2.8.aarch64.rpm"
RPM_HASH = "51dcaf00f0d1146888f0160b987fa9f304b36d3f2bf7ed5699bf26a7109c9d474dec346f85dd68376a63f094902f6395d3fc7ddba23b81d43457474e79334aff"

RPROVIDES:${PN} += "libbrasero-utils3-1 \
libbrasero-utils3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtotem-plparser.so.18"

inherit rpm
