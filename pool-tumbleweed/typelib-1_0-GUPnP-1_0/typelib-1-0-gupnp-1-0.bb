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

PV = "1.6.4"

RPM_NAME = "typelib-1_0-GUPnP-1_0-1.6.4-2.1.aarch64.rpm"
RPM_HASH = "56205fc54c16db55d7ef08f999c70ecf0a4bbad5ba31d43cd041c89042f8e09a0d6273a5f73e2d029645438ef1848e12074c937573c5dff1c5cbc6d3d7e425bf"

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
