SUMMARY = "GNU Spread Sheet Widget library for Gtk+"
DESCRIPTION = "GNU Spread Sheet Widget is a library for Gtk+ which provides a widget for \
viewing and manipulating 2-dimensional tabular data in a manner similar to many \
popular spread sheet programs. \
 \
The design follows the model-view-controller paradigm and is of complexity O(1) \
in both time and space. This means that it is efficient and fast even for very \
large data. \
 \
Features commonly found in graphical user interfaces such as cut and paste, \
drag and drop and row/column labelling are also included."
LICENSE = "GPL-3.0-or-later"

PV = "0.8"

RPM_NAME = "libspread-sheet-widget0-0.8-1.11.aarch64.rpm"
RPM_HASH = "4cb654e482b995cb7574b93b3a742eb6a9b7f7cf9abf92e80e9e981e142bb09009af2414df185e575ffde392117fb546265de2847975f243119d0ffd67ce8cc3"

RPROVIDES:${PN} += "libspread-sheet-widget.so.0 \
libspread-sheet-widget0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
