SUMMARY = "Collection of helpers for building DLNA applications - Introspection bindings"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package provides the GObject Introspection bindings for GUPnP-DLNA."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "typelib-1_0-GUPnPDLNA-2_0-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "9786055c38b9bd25096bfbca6cee4d74293bf27437f80a3857dbfca6b13abdd8c925136633839a8d7ea38c3ccae0a761e5f9617519140c83543789639f72527d"

RPROVIDES:${PN} += "typelib-1-0-GUPnPDLNA-2-0 \
typelib-GUPnPDLNA"

RDEPENDS:${PN} += "libgupnp-dlna-2.0.so.4 \
typelib-GLib \
typelib-GObject"

inherit rpm
