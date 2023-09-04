SUMMARY = "Introspection bindings for the HarfBuzz/GObject library"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides the GObject Introspection bindings for HarfBuzz."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "typelib-1_0-HarfBuzz-0_0-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "51bad5b72464fd61478dbf8c12d4d5a35637d7eda9fd87a6c98fd10d7e1c8d4a698b418bce72b7123b4c737f426a41c5ad475f7e207fc82345902faa4558785a"

RPROVIDES:${PN} += "typelib-1-0-HarfBuzz-0-0 \
typelib-HarfBuzz"

RDEPENDS:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz.so.0 \
typelib-GLib \
typelib-GObject \
typelib-freetype2"

inherit rpm
