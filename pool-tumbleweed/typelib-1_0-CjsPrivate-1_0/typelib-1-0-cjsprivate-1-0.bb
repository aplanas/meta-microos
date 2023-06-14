SUMMARY = "Cinnamon JS module -- Introspection Bindings"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package provides the GObject Introspection bindings for \
Cinnamon JS."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "typelib-1_0-CjsPrivate-1_0-5.0.0-1.10.aarch64.rpm"
RPM_HASH = "0bef13fced00663d851dbd7550bb1b3f7e8656e99ef7ed72cc89657dbbf9509eedecde53a100a14c5032eb5c879aada3b5ae1ac33d7350a3ebf81b452a65cd80"

RPROVIDES:${PN} += "typelib-1-0-CjsPrivate-1-0 \
typelib-CjsPrivate"

RDEPENDS:${PN} += "libcjs.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
