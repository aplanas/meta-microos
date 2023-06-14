SUMMARY = "Collection of helpers for building DLNA applications - Introspection bindings"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package provides the GObject Introspection bindings for GUPnP-DLNA."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "typelib-1_0-GUPnPDLNA-2_0-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "1b9b7c7a145d5de428018b68377e09654da81fe639a8e5e8d3b3c328834304bdfcf4f4565e84b1752a78be136f8e86ec629c01eadcdd5d5303dcb4fb66fe3377"

RPROVIDES:${PN} += "typelib-1-0-GUPnPDLNA-2-0 \
typelib-GUPnPDLNA"

RDEPENDS:${PN} += "libgupnp-dlna-2.0.so.4 \
typelib-GLib \
typelib-GObject"

inherit rpm
