SUMMARY = "Introspection bindings for the Facebook Graph API access library"
DESCRIPTION = "Introspection bindings for the Facebook Graph API access library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "typelib-1_0-GFBGraph-0_2-0.2.5-1.8.aarch64.rpm"
RPM_HASH = "e5383f3e68aa0212db2be29f38c0f045c79eb556078e4842803dbfaba2661d23b747996d3d6be9cde9d55acceec45efbff982a94f9769f20aea3db2d89cb311a"

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
