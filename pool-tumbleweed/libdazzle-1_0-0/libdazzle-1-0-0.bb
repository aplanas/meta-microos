SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Library file"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone. \
 \
This package provides the libdazzle shared library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-1_0-0-3.44.0-1.7.aarch64.rpm"
RPM_HASH = "e70c555889f67b8f438b071ca53269c2b95fbf84abc98c64cefb0a47b9789bc44d281e53559720f60fad5f77201da490beee63fd249e5c57a68b8ffa592eb3da"

RPROVIDES:${PN} += "libdazzle \
libdazzle-1-0-0 \
libdazzle-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
