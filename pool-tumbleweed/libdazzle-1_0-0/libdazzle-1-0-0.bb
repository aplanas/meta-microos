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
libdazzle-1.0.so.0()(64bit) \
libdazzle-1_0-0 \
libdazzle-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
