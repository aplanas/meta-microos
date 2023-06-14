SUMMARY = "GObject library, to access udev device information -- Introspection bindings"
DESCRIPTION = "This package provides the GObject Introspection bindings for libgudev, which \
provides access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "237"

RPM_NAME = "typelib-1_0-GUdev-1_0-237-3.1.aarch64.rpm"
RPM_HASH = "06c25b74796cec2e6588cf15cf686ae57d73c4ffca1370ff357d5ac57c8e7333b41c83b914d445d78a2fced7c722be0ffbdad4307e2ab04e63da1194da356337"

RPROVIDES:${PN} += "typelib-1-0-GUdev-1-0 \
typelib-GUdev"

RDEPENDS:${PN} += "libgudev-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
