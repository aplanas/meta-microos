SUMMARY = "Library for the SkyDrive and Hotmail REST APIs"
DESCRIPTION = "libzapojit is a GLib/GObject wrapper for the SkyDrive and Hotmail \
REST APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3"

RPM_NAME = "libzapojit-0_0-0-0.0.3-8.4.aarch64.rpm"
RPM_HASH = "74d61c1b3b5e3948511bd43a34152ab573a0c47de12b8fc08a3bfd8a012fea3b5df2968afa658ef33ffd7f0f43208176bbdffaabb1936577b43212d988d19558"

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
