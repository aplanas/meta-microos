SUMMARY = "Introspection bindings for the libical glib bindings."
DESCRIPTION = "This package provides the gobject-introspection bindings for libical-glib."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "typelib-1_0-ICalGLib-3_0-3.0.16-1.4.aarch64.rpm"
RPM_HASH = "2184df1e8a4a7181f7bc270c30cd1b85b94d99ed1946dac0476ed98acd25354a980754a6fe71ee4e8c14ef30ecaeb09275d78acba11cd979cee6e03c4ab11d03"

RPROVIDES:${PN} += "typelib-1-0-ICalGLib-3-0 \
typelib-ICalGLib"

RDEPENDS:${PN} += "libical-glib.so.3 \
typelib-GLib \
typelib-GObject"

inherit rpm
