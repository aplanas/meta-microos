SUMMARY = "A collection of helpers for building DLNA applications - Development Files"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-devel-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "f7be63c177d02e7f5c69d25993d8c150ca10abace11ac3bfb73d4dc7fee908620265c46b71f92f099f3b12a4cc9d34d03503db4e680cdbbdb256b6f5516ce631"

RPROVIDES:${PN} += "libgupnp-dlna-devel \
pkgconfig-gupnp-dlna-2.0 \
pkgconfig-gupnp-dlna-gst-2.0 \
pkgconfig-gupnp-dlna-metadata-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgupnp-dlna-2-0-4 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gupnp-dlna-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GUPnPDLNA-2-0 \
typelib-1-0-GUPnPDLNAGst-2-0"

inherit rpm
