SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-2_0-4-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "037190261ba2eda3768afd6261836f44349e0bbacc264a1b26d5bd78d2171c7f153518c9a7d7ae2f8a96981116fae64c14940b18bc6a587c7b553e5d3e6af00a"

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
