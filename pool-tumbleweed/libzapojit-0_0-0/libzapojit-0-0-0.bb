SUMMARY = "Library for the SkyDrive and Hotmail REST APIs"
DESCRIPTION = "libzapojit is a GLib/GObject wrapper for the SkyDrive and Hotmail \
REST APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3"

RPM_NAME = "libzapojit-0_0-0-0.0.3-8.3.aarch64.rpm"
RPM_HASH = "311cbe3e21a6fcd12439073298ed1a5c278522258d8661f187df097e550af21d2f1ed1566cd0ee28d48fe8b7b13ee6909088d71b6c3298c806564af054aa81ba"

RPROVIDES:${PN} += "libzapojit-0-0-0 \
libzapojit-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
librest-0.7.so.0 \
libsoup-2.4.so.1"

inherit rpm
