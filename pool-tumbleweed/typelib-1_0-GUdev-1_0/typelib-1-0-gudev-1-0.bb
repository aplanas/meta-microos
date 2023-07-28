SUMMARY = "GObject library, to access udev device information -- Introspection bindings"
DESCRIPTION = "This package provides the GObject Introspection bindings for libgudev, which \
provides access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "238"

RPM_NAME = "typelib-1_0-GUdev-1_0-238-1.1.aarch64.rpm"
RPM_HASH = "57ae320a5b3b108e2f398ea0fc13c7bbc597626ac44c7aa0f17b86fb62be87a195d9703d449c02cd1c9de975a44652da563f83927f5a8fdcfa74a152e67ecc19"

RPROVIDES:${PN} += "typelib-1-0-GUdev-1-0 \
typelib-GUdev"

RDEPENDS:${PN} += "libgudev-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
