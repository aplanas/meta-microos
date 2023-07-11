SUMMARY = "Cinnamon JS module -- Introspection Bindings"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package provides the GObject Introspection bindings for \
Cinnamon JS."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "typelib-1_0-CjsPrivate-1_0-5.0.0-1.11.aarch64.rpm"
RPM_HASH = "1f170483d3d1809a0a9c7e2ad1c5c82e287c61aaf7675a0f7b6328da0e2c9800c90cb811f45546f94263ec2500710a16566b40e13fd1ca50c30e816225cd78e6"

RPROVIDES:${PN} += "typelib-1-0-CjsPrivate-1-0 \
typelib-CjsPrivate"

RDEPENDS:${PN} += "libcjs.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
