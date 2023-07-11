SUMMARY = "Utility to create a cache of gdk-pixbuf loaders"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the utility to create the cache file needed for \
loadable modules."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-query-loaders-2.42.10-1.5.aarch64.rpm"
RPM_HASH = "c653bb81a640730cf89390337540570012741f1311417e08aec72ad80f19927911487f6da2810b0181d6579b60db394b4b1752a470ba3c82bc1fba2f24912fb1"

RPROVIDES:${PN} += "gdk-pixbuf-query-loaders"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
