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

RPM_NAME = "typelib-1_0-GUPnP-1_0-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "8079724a1c5135add7147629f4cca249d7816b394f2e98746a85f65fb5d4e2b3382cb0c691c9b58cf7e5c0d63a9594442820418a65334f9cb8fc65520fad23fd"

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
