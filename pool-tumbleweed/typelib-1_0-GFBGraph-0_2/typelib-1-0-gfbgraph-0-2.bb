SUMMARY = "Introspection bindings for the Facebook Graph API access library"
DESCRIPTION = "Introspection bindings for the Facebook Graph API access library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "typelib-1_0-GFBGraph-0_2-0.2.5-1.9.aarch64.rpm"
RPM_HASH = "fee536e01b2acfb878f1a389501c5eb225de467f0ddfd809c4695cd456987613c4d09ad08339979e74b4df9be975fd9ea827aa2f09f6c7ce4d3e0e0921dd6416"

RPROVIDES:${PN} += "typelib-1-0-GFBGraph-0-2 \
typelib-GFBGraph"

RDEPENDS:${PN} += "libgfbgraph-0.2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Rest \
typelib-Soup"

inherit rpm
