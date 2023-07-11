SUMMARY = "Introspection bindings for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+. \
 \
This package provides the GObject Introspection bindings for Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "typelib-1_0-Pango-1_0-1.50.14-1.4.aarch64.rpm"
RPM_HASH = "4a72bc27f7c8b12ac90b1005f51fd8fbdbbd68d4d7d409ce4d60ab785087dc771f542ed20cdfb4cbf334d4cf3ddd488941125334fcc3a14939910d27db5565d5"

RPROVIDES:${PN} += "typelib-1-0-Pango-1-0 \
typelib-Pango \
typelib-PangoCairo \
typelib-PangoFT2 \
typelib-PangoFc \
typelib-PangoOT \
typelib-PangoXft"

RDEPENDS:${PN} += "libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangoxft-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-HarfBuzz \
typelib-cairo \
typelib-fontconfig \
typelib-freetype2 \
typelib-xft \
typelib-xlib"

inherit rpm
