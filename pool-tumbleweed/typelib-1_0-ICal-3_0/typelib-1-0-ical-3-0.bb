SUMMARY = "Introspection bindings for libical"
DESCRIPTION = "This package provides the gobject-introspection bindings for libical."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "typelib-1_0-ICal-3_0-3.0.16-1.4.aarch64.rpm"
RPM_HASH = "4ce1cc943017f32090a187f19eeb7d094be0d5fcd52104245242fc8d2bfdbcff516a75436b246d91036a648cbb37a9ade3d7948361f00eab05741b97ff65bd87"

RPROVIDES:${PN} += "typelib-1-0-ICal-3-0 \
typelib-ICal"

RDEPENDS:${PN} += "libical.so.3 \
typelib-GLib \
typelib-GObject"

inherit rpm
