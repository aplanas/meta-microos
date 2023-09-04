SUMMARY = "Building blocks for modern GNOME applications"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the shared library for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libadwaita-1-0-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "f9c74351afa49c06761bba818847042a4d84d91aec1b3b0a3ef21c72cb3af1b55711cc7822ab32ccfb76a93c5b92a272d8cb336ff52ebdb7445724a4e96c703c"

RPROVIDES:${PN} += "libadwaita \
libadwaita-1-0 \
libadwaita-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
