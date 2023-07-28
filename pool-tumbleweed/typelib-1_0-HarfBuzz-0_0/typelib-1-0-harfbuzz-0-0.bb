SUMMARY = "Introspection bindings for the HarfBuzz/GObject library"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides the GObject Introspection bindings for HarfBuzz."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "typelib-1_0-HarfBuzz-0_0-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "345e231f673839cc75855c3b1320e534427b40d1821a06f96538142b45388651d295334e916f54af3fff6f6970acef045c94782651465cf27e1e29e616a0675f"

RPROVIDES:${PN} += "typelib-1-0-HarfBuzz-0-0 \
typelib-HarfBuzz"

RDEPENDS:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz.so.0 \
typelib-GLib \
typelib-GObject \
typelib-freetype2"

inherit rpm
