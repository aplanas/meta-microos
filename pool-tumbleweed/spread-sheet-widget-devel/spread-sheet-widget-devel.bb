SUMMARY = "Header files for GNU Gtk+ Spread Sheet Widget library"
DESCRIPTION = "GNU Spread Sheet Widget is a library for Gtk+ which provides a widget \
for viewing and manipulating 2-dimensional tabular data in a manner \
similar to many popular spread sheet programs. \
 \
This subpackage contains the header files for the library."
LICENSE = "GPL-3.0-or-later"

PV = "0.8"

RPM_NAME = "spread-sheet-widget-devel-0.8-1.11.aarch64.rpm"
RPM_HASH = "5c54b2deafcb4faa88d2a16b7d64402afff0471de3af85a6a6a33d8a58e5de49ee0020fb4c1262c531a66c18700797991034fa7338082c662ec2937149f433dc"

RPROVIDES:${PN} += "pkgconfig-spread-sheet-widget \
spread-sheet-widget-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspread-sheet-widget0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
