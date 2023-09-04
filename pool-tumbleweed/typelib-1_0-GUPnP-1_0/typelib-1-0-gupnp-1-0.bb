SUMMARY = "Implementation of the UPnP specification -- Introspection bindings"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework. \
 \
This package provides the GObject Introspection bindings for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.5"

RPM_NAME = "typelib-1_0-GUPnP-1_0-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "caf21d3e288d8e50e72fd7b535c154df0e4c5a47aa250fd05b13b860ebc5335df1b1f26273d8531b06918e5cd18ea5400326b989f849fef86e10f7e2a3316db5"

RPROVIDES:${PN} += "typelib-1-0-GUPnP-1-0 \
typelib-GUPnP"

RDEPENDS:${PN} += "libgupnp-1.6.so.0 \
typelib-GLib \
typelib-GObject \
typelib-GSSDP \
typelib-Gio \
typelib-Soup \
typelib-libxml2"

inherit rpm
