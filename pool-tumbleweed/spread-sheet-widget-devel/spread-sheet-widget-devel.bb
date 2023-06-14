SUMMARY = "Header files for GNU Gtk+ Spread Sheet Widget library"
DESCRIPTION = "GNU Spread Sheet Widget is a library for Gtk+ which provides a widget \
for viewing and manipulating 2-dimensional tabular data in a manner \
similar to many popular spread sheet programs. \
 \
This subpackage contains the header files for the library."
LICENSE = "GPL-3.0-or-later"

PV = "0.8"

RPM_NAME = "spread-sheet-widget-devel-0.8-1.10.aarch64.rpm"
RPM_HASH = "0feeed7ead2122f38e754290b9c471dd14885686cf4c3f453b55bfb3b4d61a15fb5ff9b5ab9b2469aea8b3009a60b24ee042ec52586d7b31c2d4940c10c80ae2"

RPROVIDES:${PN} += "pkgconfig-spread-sheet-widget \
spread-sheet-widget-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspread-sheet-widget0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
