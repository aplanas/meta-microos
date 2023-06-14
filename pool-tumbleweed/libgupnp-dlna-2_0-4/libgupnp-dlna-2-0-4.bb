SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-2_0-4-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "1977fc489e690068838c499c1ea325d49f359a5d1a98e1fa3238b1b396406e803c99de6490f29a14d26cfb70bf2c86582a556222cab728dbd8f96c829ccfc40b"

RPROVIDES:${PN} += "libgupnp-dlna-2-0-4 \
libgupnp-dlna-2.0.so.4 \
libgupnp-dlna-gst-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
gupnp-dlna \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgupnp-dlna-backend \
libxml2.so.2"

inherit rpm
