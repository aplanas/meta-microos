SUMMARY = "GTK3 Spell Checker Interface Library -- Introspection bindings"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "typelib-1_0-GtkSpell-3_0-3.0.10-3.9.aarch64.rpm"
RPM_HASH = "4e5fbfb896b03d3fdff0036c8d1622054587b6bf1d31bf93d4e7bf4441000bd669ba05c96acc17fd08b9500df01254b0c80d4be5274874a8a7018895ce508ecb"

RPROVIDES:${PN} += "typelib-1-0-GtkSpell-3-0 \
typelib-GtkSpell"

RDEPENDS:${PN} += "libgtkspell3-3.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
