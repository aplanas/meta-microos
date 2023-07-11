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

RPM_NAME = "libdazzle-1_0-0-3.44.0-1.8.aarch64.rpm"
RPM_HASH = "e55f33869436f1b47ad302876b780681f658133a0732cdd1229aff1ca7b3404d288e0d9b8a8a2bbebcc21bce0788aa5ed3c915124c389f0c6ce73eebba94f74e"

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
